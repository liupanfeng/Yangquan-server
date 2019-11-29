package com.yangquan.server.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangquan.mapper.ServerCustomerMapper;
import com.yangquan.mapper.UserMapper;
import com.yangquan.mapper.UserTokenMapper;
import com.yangquan.pojo.ServerCustomer;
import com.yangquan.pojo.ServerCustomerExample;
import com.yangquan.pojo.User;
import com.yangquan.pojo.UserExample;
import com.yangquan.pojo.UserExample.Criteria;
import com.yangquan.pojo.UserToken;
import com.yangquan.pojo.UserTokenExample;
import com.yangquan.server.service.UserService;
import com.yangquan.utils.ExceptionUtil;
import com.yangquan.utils.IDUtils;
import com.yangquan.utils.ResponseResult;

/**
 * service 里边不要添加try catch 因为如果出问题，被抓住的话，事务不会起作用
 * 
 * @author root
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserTokenMapper userTokenMapper;
	
	@Autowired
	private ServerCustomerMapper serverCustomerMapper;


	/**
	 * 注册接口，这里自动帮用户生成user_id
	 */
	@Override
	public ResponseResult createUser(User user) {
		UserExample example=new UserExample();
		example.createCriteria().andPhoneNumberEqualTo(user.getPhoneNumber());
		List<User> list = userMapper.selectByExample(example);
		if (list == null || list.isEmpty()) {
			user.setUserId(IDUtils.genItemId());
			user.setCreateTime(new Date());
//			int userType=user.getUserType();
//			String phoneId=user.getPhoneNumber().substring(5);
//			String nickname="";
//			switch (userType) {
//			case 1://养殖户
//				nickname="养殖户";
//				break;
//			case 2://经纪人
//				nickname="经纪人";
//				break;
//			case 3://出售饲料
//				nickname="出售饲料";
//				break;
//			case 4://出售兽药
//				nickname="出售兽药";
//				break;
//			case 5://羊五金
//				nickname="羊五金";
//				break;
//			case 6://羊粪处理
//				nickname="羊粪处理";
//				break;
//			case 7://车队
//				nickname="车队";
//				break;
//			case 8://剪羊毛
//				nickname="剪羊毛";
//				break;
//			case 9://打疫苗
//				nickname="打疫苗";
//				break;
//			case 10://羊崽经纪人
//				nickname="羊崽经纪人";
//				break;
//
//			default:
//				break;
//			}
//			user.setNickname(nickname+phoneId);
			userMapper.insert(user);
			return ResponseResult.build(200, "注册成功！",user);
		}
		return ResponseResult.build(401, "该手机号已经注册，请登录！",user);
	}

	/**
	 * 用户登录，现在只需要手机号进行登录
	 */
	@Override
	public ResponseResult userLogin(String phoneNum) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andPhoneNumberEqualTo(phoneNum);
		List<User> list = userMapper.selectByExample(example);
		if (list == null || list.isEmpty()) {
			// 未注册提示先进行注册再登录
			return ResponseResult.build(404, "请先注册再登录");
		}
		// 生成token
		String token = UUID.randomUUID().toString();
		// 将token插入数据库
		User user = list.get(0);
		user.setTokenId(token);
		UserTokenExample userTokenExample =new UserTokenExample();
		userTokenExample.createCriteria().andPhoneNumberEqualTo(user.getPhoneNumber());
		List<UserToken> userTokens=userTokenMapper.selectByExample(userTokenExample);
		if (userTokens == null || userTokens.isEmpty()) {
			UserToken userToken=new UserToken();
			userToken.setTokenId(token);
			userToken.setPhoneNumber(user.getPhoneNumber());
			userToken.setUserId(user.getUserId());
			userTokenMapper.insert(userToken);
		}
		
		// 更新数据库
		updateUser(user);
		return ResponseResult.build(200, "登录成功", user);
	}
	
	/**
	 * 更新用户的时候，自动创建server_custom数据
	 */

	@Override
	public ResponseResult updateUser(User user) {
		userMapper.updateByPrimaryKey(user);
		if(!TextUtils.isEmpty(user.getPhotoUrl())&&!TextUtils.isEmpty(user.getAutograph())){
			ServerCustomerExample example=new ServerCustomerExample();
			example.createCriteria().andUserIdEqualTo(user.getUserId());
			List<ServerCustomer> list=serverCustomerMapper.selectByExample(example);
			
			if (list == null || list.isEmpty()) {
				ServerCustomer serverCustomer=new ServerCustomer();
				serverCustomer.setCreateTime(new Date());
				serverCustomer.setNickname(user.getNickname());
				serverCustomer.setPhotoUrl(user.getPhotoUrl());
				serverCustomer.setUserId(user.getUserId());
				serverCustomer.setAutograph(user.getAutograph());
				serverCustomer.setServerId(IDUtils.genItemId());
				serverCustomerMapper.insert(serverCustomer);
			}else{
				ServerCustomer serverCustomer=list.get(0);
				serverCustomer.setNickname(user.getNickname());
				serverCustomer.setPhotoUrl(user.getPhotoUrl());
				serverCustomer.setUserId(user.getUserId());
				serverCustomer.setAutograph(user.getAutograph());
				serverCustomerMapper.updateByPrimaryKey(serverCustomer);
			}
			
		}else{
			//当头像和签名不是同时存在的时候，需要删除server_custom 对应的数据
			ServerCustomerExample example=new ServerCustomerExample();
			example.createCriteria().andUserIdEqualTo(user.getUserId());
			List<ServerCustomer> list=serverCustomerMapper.selectByExample(example);
			if (list == null || list.isEmpty()) {
				//不存在，不用做处理
			}else{
				ServerCustomer serverCustomer=list.get(0);
				serverCustomerMapper.deleteByPrimaryKey(serverCustomer.getId());
			}
		}
		
		return ResponseResult.build(200, "更新成功", user);
	}

	@Override
	public ResponseResult deleteUser(User user) {
		userMapper.deleteByPrimaryKey(user.getId());
		return ResponseResult.build(200, "删除用户成功", user);
	}

}