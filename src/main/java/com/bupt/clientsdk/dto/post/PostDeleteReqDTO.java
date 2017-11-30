package com.bupt.clientsdk.dto.post;

import com.bupt.clientsdk.dto.BaseRequestDTO;

public class PostDeleteReqDTO extends BaseRequestDTO {

	private static final long serialVersionUID = -477250687304617087L;

	private Long id;

	public PostDeleteReqDTO() {
		super();
	}

	public PostDeleteReqDTO(Long id) {
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
		return "PostDeleteReqDTO [id=" + id + "]";
	}
	
}
