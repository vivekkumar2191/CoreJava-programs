package com.java.immutableExamp;

	
public final class CustumImmutableExample {
	final String name;
	final Integer id;
	public CustumImmutableExample(String name, Integer id) {
		
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Integer getId() {
		return id;
	}
	

}