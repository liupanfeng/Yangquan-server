package com.yangquan.server.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.yangquan.server.bean.TmiPushMessageVo;

import cn.jiguang.common.ClientConfig;
import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jiguang.common.resp.DefaultResult;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.AndroidNotification;
import cn.jpush.api.push.model.notification.IosNotification;
import cn.jpush.api.push.model.notification.Notification;

@Service
public class JiPushServiceImpl {
	
//	private static final String appKey = "16e4843c6591302c5d1b26de";
//	private static final String masterSecret = "9717ca9c3d6a17b0a58ed802";
	
	@Value("${appKey}")
	private String appKey;
	@Value("{masterSecret}")
	private String masterSecret ;
	
	public  JPushClient getJpushClient() throws Exception {
		ClientConfig config = ClientConfig.getInstance();
		config.setApnsProduction(false); // development env
		config.setTimeToLive(60 * 60 * 24 * 10); // ten day
		config.setMaxRetryTimes(5);
		config.setConnectionTimeout(10 * 1000); // 10 seconds
		return new JPushClient(masterSecret, appKey, null, config);
	}
	
	  /**
     * 更新设备信息和用户别名的关联信息
     * @param registrationId 设备信息
     * @param userId         用户id
     * @return
     * @throws Exception
     */
    public boolean updateDeviceAlias(String registrationId,String userId) throws APIConnectionException, APIRequestException {
        JPushClient jpushClient = null;
        try {
            jpushClient = getJpushClient();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(jpushClient != null){
            DefaultResult result = jpushClient.updateDeviceTagAlias(registrationId, userId, null, null);
            return result.isResultOK();
        }
        return false;
    }
    
    
    /**
     *  发送推送消息
     * @param pushType  1，系统通知  2，官方运营官 3，新增粉丝 4，新增点赞 5，新增评论
     * @param contentType 1，话题  2，视频  3，活动  4，评论  5， @   99，其他
     * @param relatedId   消息内容对象对应的id：
     *                 1.系统消息，官方运营官对应的message的id
     *                 2.点赞、关注对应的是，interact的id
     *                 3.评论对应的是comment的id
     * @param title   标题
     * @param content   内容
     * @param targetId  接收人id
     */
    public boolean sendPush(int pushType,int contentType,long relatedId,String title,String content,String targetId) throws Exception {
        if(StringUtils.isBlank(targetId)){
            return false;
        }
        TmiPushMessageVo pushMessage = buildPushMessage(pushType, contentType, relatedId, title, content, targetId);
        PushPayload payload;
        //根据targetId来判断怎么发
        if("0".equals(targetId)){
            payload = buildPushObject_all_all_alert(pushType,title);
        }else {
            payload = buildPushObject_all_alias_alert(pushType,title,targetId.split(","));
        }
        //发送请求
        PushResult pushResult = getJpushClient().sendPush(payload);

        pushMessage.setPushId(pushResult.msg_id);
        pushMessage.setResult(pushResult.isResultOK() ? 1:0);
//        pushMessageDao.insert(pushMessage);

        return pushResult.isResultOK();
    }
    
    
    /**
     * 根据别名推送
     * @param userId
     * @param alert
     * @return
     */
    private static PushPayload buildPushObject_all_alias_alert(int pushType,String alert,String... userId) {
        Map<String, String> extras = new HashMap<>();
        extras.put("pushType",Integer.toString(pushType));

        return PushPayload.newBuilder()
                .setPlatform(Platform.all())
                .setAudience(Audience.alias(userId))
                .setNotification(Notification.newBuilder()
                        .setAlert(alert)
                        .addPlatformNotification(AndroidNotification.newBuilder()
                                .addExtras(extras).build())
                        .addPlatformNotification(IosNotification.newBuilder()
                                .addExtras(extras).build())
                        .build())
                .build();
    }

    
    
    
    /**
     * 发送给全体用户
     * @param alert
     * @return
     */
    private static PushPayload buildPushObject_all_all_alert(int pushType, String alert) {
        Map<String, String> extras = new HashMap<>();
        extras.put("pushType",Integer.toString(pushType));
        return PushPayload.newBuilder()
                .setPlatform(Platform.all())
                .setAudience(Audience.all())
                .setNotification(Notification.newBuilder()
                        .setAlert(alert)
                        .addPlatformNotification(AndroidNotification.newBuilder()
                                .addExtras(extras).build())
                        .addPlatformNotification(IosNotification.newBuilder()
                                .addExtras(extras).build())
                        .build())
                .build();
    }

    
    
    
    /**
     * 根据参数生成 pushMessage
     * @return
     */
    public TmiPushMessageVo buildPushMessage(int pushType,int contentType,long relatedId,String title,String content,String targetId) throws Exception {
        TmiPushMessageVo pushMessage = new TmiPushMessageVo();
        pushMessage.setTitle(title);
        pushMessage.setContent(content);
        pushMessage.setPushType(pushType);
        pushMessage.setContentType(contentType);
        pushMessage.setTargetId(targetId);
        pushMessage.setInitDate(new Date());
        pushMessage.setRelatedId(relatedId);
        return pushMessage;
    }
    
    
    public void testSendPush(String title,String content){
    	  JPushClient jpushClient = null;
          try {
              jpushClient = getJpushClient();
          } catch (Exception e) {
              e.printStackTrace();
          }
          
    }


    

}
