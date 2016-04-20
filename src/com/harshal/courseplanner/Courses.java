package com.harshal.courseplanner;

public class Courses {
	
	private int id;
	private String code;
	private String title;
	
	public Courses(int id, String code, String title) {
		
		this.id = id;
		this.code = code;
		this.title = title;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
}
