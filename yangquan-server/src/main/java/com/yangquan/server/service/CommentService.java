package com.yangquan.server.service;

import com.yangquan.pojo.Comment;
import com.yangquan.utils.ResponseResult;

public interface CommentService {

	public ResponseResult addComment(Comment comment);
	
	public ResponseResult deleteComment(Comment comment);
	
	public ResponseResult updateComment(Comment comment);
	
	public ResponseResult getComment(long messageId);
	
}
