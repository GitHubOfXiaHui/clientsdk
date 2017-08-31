package com.bupt.clientsdk.dto.post;

import java.util.List;

import com.bupt.clientsdk.dto.BaseResponseDTO;
import com.bupt.clientsdk.dto.page.DWZPage;

public class PostFindResDTO extends BaseResponseDTO {

	private static final long serialVersionUID = -8217280258055296034L;

	private List<PostDTO> posts;
	
	private DWZPage page;

	public List<PostDTO> getPosts() {
		return posts;
	}

	public void setPosts(List<PostDTO> posts) {
		this.posts = posts;
	}

	public DWZPage getPage() {
		return page;
	}

	public void setPage(DWZPage page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "PostFindResDTO [posts=" + posts + ", page=" + page + ", code=" + code + ", msg=" + msg + "]";
	}

}
