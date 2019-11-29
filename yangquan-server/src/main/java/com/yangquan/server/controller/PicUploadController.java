package com.yangquan.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangquan.utils.PictureResult;

@Controller
@RequestMapping("/pic")
public class PicUploadController {
	
	@ResponseBody
	@RequestMapping("/upload")
	public PictureResult uploadPic(){
		
		return new PictureResult(200, "baidu.com");
	}
}
