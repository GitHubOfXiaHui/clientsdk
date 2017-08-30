package com.bupt.clientsdk.dto.post;

import com.bupt.clientsdk.dto.BaseResponseDTO;
import com.bupt.clientsdk.dto.enumeration.ResponseEnum;

public class PostCreateResDTO extends BaseResponseDTO {

	private static final long serialVersionUID = -1678892543385130593L;

	public boolean isSuccess() {
		return code != null && code == ResponseEnum.SUCCESS.getCode();
	}
	
}
