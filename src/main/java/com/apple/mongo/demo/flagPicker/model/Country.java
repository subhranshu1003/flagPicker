package com.apple.mongo.demo.flagPicker.model;

public class Country {
	
	private String name;
	private String flag;
	
	public Country(String name, String flag) {
		super();
		this.name = name;
		this.flag = flag;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "country [name=" + name + ", flag=" + flag + "]";
	}
	

}
