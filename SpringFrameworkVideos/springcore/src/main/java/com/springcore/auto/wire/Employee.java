package com.springcore.auto.wire;

public class Employee {
	
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Employee setter called");
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Employee constructor called");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	

}
