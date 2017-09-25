package com.bupt.clientsdk.dto.post;

import java.io.Serializable;
import java.util.Set;

import com.bupt.clientsdk.dto.KeywordDTO;

public class PostCreateReqDTO implements Serializable {

	private static final long serialVersionUID = 411939355141358278L;

	private PostDTO post;
	
	private Set<KeywordDTO> keywords;

	public PostCreateReqDTO() {
		super();
	}

	public PostCreateReqDTO(PostDTO post, Set<KeywordDTO> keywords) {
		super();
		this.post = post;
		this.keywords = keywords;
	}

	public PostDTO getPost() {
		return post;
	}

	public void setPost(PostDTO post) {
		this.post = post;
	}

	public Set<KeywordDTO> getKeywords() {
		return keywords;
	}

	public void setKeywords(Set<KeywordDTO> keywords) {
		this.keywords = keywords;
	}

	@Override
	public String toString() {
		return "PostCreateReqDTO [post=" + post + ", keywords=" + keywords + "]";
	}

}
