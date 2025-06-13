package com.enums;

public enum Gender {

	M("male"), FM("Female"), T("Transgender");

	public String type;

	Gender(String type) {
		this.type = type;
	}
}
