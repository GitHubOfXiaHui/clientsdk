package com.bupt.clientsdk.dto.post;

import com.bupt.clientsdk.dto.BaseRequestDTO;

public class PostGetReqDTO extends BaseRequestDTO {

	private static final long serialVersionUID = -595792088104115726L;

	private Long id;

	public PostGetReqDTO() {
		super();
	}

	public PostGetReqDTO(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "PostGetReqDTO [id=" + id + "]";
	}
	
}
