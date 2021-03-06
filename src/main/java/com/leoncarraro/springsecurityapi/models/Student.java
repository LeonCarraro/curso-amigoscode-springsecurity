package com.leoncarraro.springsecurityapi.models;

public class Student {

	private final Long id;
	private final String name;
	
	public Student(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student id:");
		builder.append(id);
		builder.append(", name:");
		builder.append(name);
		return builder.toString();
	}
	
}
