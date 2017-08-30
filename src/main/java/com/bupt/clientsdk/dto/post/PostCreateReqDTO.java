package com.bupt.clientsdk.dto.post;

import java.util.Set;

import com.bupt.clientsdk.dto.BaseRequestDTO;
import com.bupt.clientsdk.dto.KeywordDTO;

public class PostCreateReqDTO extends BaseRequestDTO {

	private static final long serialVersionUID = 411939355141358278L;

	private String text;
	
	private Set<KeywordDTO> keywords;

	public PostCreateReqDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PostCreateReqDTO(String text, Set<KeywordDTO> keywords) {
		super();
		this.text = text;
		this.keywords = keywords;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Set<KeywordDTO> getKeywords() {
		return keywords;
	}

	public void setKeywords(Set<KeywordDTO> keywords) {
		this.keywords = keywords;
	}

	@Override
	public String toString() {
		return "PostCreateReqDTO [text=" + text + ", keywords=" + keywords + ", id=" + id + "]";
	}
	
}
