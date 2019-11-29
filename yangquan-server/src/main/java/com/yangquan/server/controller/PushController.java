package com.yangquan.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yangquan.server.service.impl.JiPushServiceImpl;
import com.yangquan.utils.ThreadPool;

import cn.jpush.api.JPushClient;

@Controller
@RequestMapping("/push")
public class PushController {
	
	@Autowired
	private JiPushServiceImpl jiPushService;
	
	
	@RequestMapping("/send")
	public void sendPush(){
		try {
			JPushClient jPushClient=jiPushService.getJpushClient();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 //推送
        ThreadPool.runInFixed(new Runnable() {
            @Override
            public void run() {
                try {
                    jiPushService.sendPush(1,1,1425,"关注通知","国泰" + "关注了你","0");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
		
		
	}
	
}
