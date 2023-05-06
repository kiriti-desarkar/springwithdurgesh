package com.springcore.collections.standalone;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friends;
	private Map<String,Integer> feeStructure;
	
	

	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}
	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Person(List<String> friends, Map<String, Integer> feeStructure) {
		super();
		this.friends = friends;
		this.feeStructure = feeStructure;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feeStructure=" + feeStructure + "]";
	}


}
