package com.bupt.clientsdk.dto.post;

import com.bupt.clientsdk.dto.BaseRequestDTO;

public class PostUpdateReqDTO extends BaseRequestDTO {

	private static final long serialVersionUID = 463657700331740108L;

	private PostDeleteReqDTO postDeleteReq;
	private PostCreateReqDTO postCreateReq;

	public PostDeleteReqDTO getPostDeleteReq() {
		return postDeleteReq;
	}

	public void setPostDeleteReq(PostDeleteReqDTO postDeleteReq) {
		this.postDeleteReq = postDeleteReq;
	}

	public PostCreateReqDTO getPostCreateReq() {
		return postCreateReq;
	}

	public void setPostCreateReq(PostCreateReqDTO postCreateReq) {
		this.postCreateReq = postCreateReq;
	}

	@Override
	public String toString() {
		return "PostUpdateReqDTO [postDeleteReq=" + postDeleteReq + ", postCreateReq=" + postCreateReq + "]";
	}

}
