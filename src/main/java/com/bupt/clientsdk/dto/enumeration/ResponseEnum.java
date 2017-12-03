package com.bupt.clientsdk.dto.enumeration;

public enum ResponseEnum {
	/**
	 * 成功
	 */
	SUCCESS(0, "成功"),
	/**
	 *  参数错误
	 */
	ERROR_10(10, "参数错误"),
	/**
	 * 租户不存在
	 */
	ERROR_11(11, "租户不存在"),
	/**
	 * 租期已到，请及时续租
	 */
	ERROR_12(12, "租期已到，请及时续租"),
	/**
	 * 结果解析错误
	 */
	ERROR_13(13, "结果解析错误"),
	/**
	 * 服务器发生未知错误
	 */
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
