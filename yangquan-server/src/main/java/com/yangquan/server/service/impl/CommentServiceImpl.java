package com.yangquan.server.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangquan.mapper.CommentMapper;
import com.yangquan.pojo.Comment;
import com.yangquan.pojo.CommentExample;
import com.yangquan.server.service.CommentService;
import com.yangquan.utils.ResponseResult;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentMapper mapper;
	@Override
	public ResponseResult addComment(Comment comment) {
		comment.setCreateTime(new Date());
		mapper.insert(comment);
		return ResponseResult.build(200, "添加评论成功",comment);
	}

	@Override
	public ResponseResult deleteComment(Comment comment) {
		mapper.deleteByPrimaryKey(comment.getId());
		return ResponseResult.build(200, "删除评论成功",comment);
	}

	@Override
	public ResponseResult updateComment(Comment comment) {
		mapper.updateByPrimaryKey(comment);
		return ResponseResult.build(200, "更新评论成功",comment);
	}

	@Override
	public ResponseResult getComment(long messageId) {
		CommentExample example=new CommentExample();
		example.createCriteria().andMessageIdEqualTo(messageId);
		List<Comment> list=mapper.selectByExample(example);
		if(list==null||list.isEmpty()){
			return ResponseResult.build(404, "未查到任何评论数据");
		}
		return ResponseResult.build(200, "获取评论数据成功！", list);
	}

}
