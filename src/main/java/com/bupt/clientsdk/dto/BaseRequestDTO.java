package com.bupt.clientsdk.dto;

import java.io.Serializable;

public abstract class BaseRequestDTO implements Serializable {

	private static final long serialVersionUID = -2816904600143397442L;

	private String user = "0,xiahui";

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "BaseRequestDTO [user=" + user + "]";
	}
	
}
