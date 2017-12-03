package com.bupt.clientsdk.dto;

import java.io.Serializable;

import com.bupt.clientsdk.dto.enumeration.ResponseEnum;

public abstract class BaseResponseDTO implements Serializable {

	private static final long serialVersionUID = -1747107267895182320L;

	protected Integer code;
	protected String msg;

	public static <T extends BaseResponseDTO> T buildResponse(ResponseEnum type, Class<T> clazz) throws Exception {
		T response = clazz.newInstance();
		response.code = type.getCode();
		response.msg = type.getMsg();
		return response;
	}

	public boolean isSuccess() {
		return code != null && code == ResponseEnum.SUCCESS.getCode();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
