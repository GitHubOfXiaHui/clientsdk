package com.bupt.clientsdk.dto.post;

import java.util.Set;

import com.bupt.clientsdk.dto.BaseRequestDTO;
import com.bupt.clientsdk.dto.page.DWZPage;

public class PostFindReqDTO extends BaseRequestDTO {

	private static final long serialVersionUID = -7924989274262436765L;

	private Set<String> keywords;
	
	private DWZPage page;

	public PostFindReqDTO() {
		super();
	}

	public PostFindReqDTO(Set<String> keywords, DWZPage page) {
		super();
		this.keywords = keywords;
		this.page = page;
	}

	public Set<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(Set<String> keywords) {
		this.keywords = keywords;
	}

	public DWZPage getPage() {
		return page;
	}

	public void setPage(DWZPage page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "PostFindReqDTO [keywords=" + keywords + ", page=" + page + "]";
	}

}
