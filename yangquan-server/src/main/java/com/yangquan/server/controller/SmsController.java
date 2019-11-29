package com.yangquan.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.profile.DefaultProfile;
import com.yangquan.utils.ResponseResult;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.CommonResponse;

@Controller
@RequestMapping("/sms")
public class SmsController {

	@RequestMapping("/send")
	@ResponseBody
	public ResponseResult sendSmsMessage() {
		SendSms();
		return ResponseResult.build(200, "短信发送成功");
	}

	public void SendSms() {
		DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4FfZN3PsqUCTGfDe1ip5",
				"pY0ayLu6geHGCsOSzNRQ6MxQ2AHsdw");
		IAcsClient client = new DefaultAcsClient(profile);
		CommonRequest request = new CommonRequest();
		request.setMethod(MethodType.POST);
		request.setDomain("dysmsapi.aliyuncs.com");
		request.setVersion("2017-05-25");
		request.setAction("SendSms");
		request.putQueryParameter("RegionId", "cn-hangzhou");
		request.putQueryParameter("PhoneNumbers", "18810765302");
		request.putQueryParameter("SignName", "羊圈");
	    request.putQueryParameter("TemplateCode", "SMS_178985742");
	    request.putQueryParameter("TemplateParam", "{code:363956}");
	    
		try {
			CommonResponse response = client.getCommonResponse(request);
			System.out.println(response.getData());
		} catch (ServerException e) {
			e.printStackTrace();
		} catch (ClientException e) {
			e.printStackTrace();
		}
	}

}
