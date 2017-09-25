package com.bupt.clientsdk.dto.post;

import com.bupt.clientsdk.dto.BaseResponseDTO;

public class PostGetResDTO extends BaseResponseDTO {

	private static final long serialVersionUID = 1795256325287043780L;

	private PostDTO post;

	public PostGetResDTO() {
		super();
	}

	public PostGetResDTO(PostDTO post) {
		super();
		this.post = post;
	}

	public PostDTO getPost() {
		return post;
	}

	public void setPost(PostDTO post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "PostGetResDTO [post=" + post + ", code=" + code + ", msg=" + msg + "]";
	}
	
}
