package com.bupt.clientsdk.dto.enumeration;

public enum ResponseEnum {
	SUCCESS(0, "成功"),
	ERROR_10(10, "参数错误"),
	ERROR_20(20, "服务器发生未知错误");
	
	private int code;
	private String msg;
	
	ResponseEnum(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
	
}
