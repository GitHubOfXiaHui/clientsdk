package com.bupt.clientsdk.dto.post;

import java.io.Serializable;

public class PostDeleteReqDTO implements Serializable {

	private static final long serialVersionUID = -477250687304617087L;

	private Long id;

	public PostDeleteReqDTO() {
		super();
		// TODO Auto-generated constructor stub
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
