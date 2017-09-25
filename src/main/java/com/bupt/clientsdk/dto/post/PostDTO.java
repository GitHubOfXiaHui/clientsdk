package com.bupt.clientsdk.dto.post;

import java.io.Serializable;

public class PostDTO implements Serializable {

	private static final long serialVersionUID = 8828136590358584091L;

	private Long id;
	
	private String text;

	public PostDTO() {
		super();
	}

	public PostDTO(String text) {
		super();
		this.text = text;
	}

	public PostDTO(Long id, String text) {
		super();
		this.id = id;
		this.text = text;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "PostDTO [text=" + text + "]";
	}
	
}
