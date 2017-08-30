package com.bupt.clientsdk.dto;

import java.io.Serializable;

import com.bupt.clientsdk.dto.enumeration.ResponseEnum;

public abstract class BaseResponseDTO implements Serializable {

	private static final long serialVersionUID = -1747107267895182320L;

	protected Integer code;
	protected String msg;

	@SuppressWarnings("unchecked")
	public static <T> T buildResponse(ResponseEnum type, Class<?> clazz) throws Exception {
		Object obj = clazz.newInstance();
		if (obj instanceof BaseResponseDTO) {
			BaseResponseDTO response = (BaseResponseDTO) obj;
			response.code = type.getCode();
			response.msg = type.getMsg();
		}
		return (T) obj;
	}
	
	public String getMsg() {
		return msg;
	}

}
