package com.bupt.clientsdk.dto;

import java.io.Serializable;

public class KeywordDTO implements Serializable {

	private static final long serialVersionUID = -7752074846634209945L;

	private String value;

	public KeywordDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KeywordDTO(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KeywordDTO other = (KeywordDTO) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "KeywordDTO [value=" + value + "]";
	}
	
}
