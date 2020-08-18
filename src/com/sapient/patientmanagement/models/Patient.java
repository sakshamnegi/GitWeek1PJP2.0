package com.sapient.patientmanagement.models;

import java.util.List;

public class Patient {

	private String name;
	private String id;
	private List<String> ailments;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<String> getAilments() {
		return ailments;
	}

	public void setAilments(List<String> ailments) {
		this.ailments = ailments;
	}
}
