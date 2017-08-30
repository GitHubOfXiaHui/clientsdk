package com.bupt.clientsdk.dto;

import java.io.Serializable;

public abstract class BaseRequestDTO implements Serializable {

	private static final long serialVersionUID = -2816904600143397442L;
	
	protected Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
