package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Constructor called for int,int");
	}
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Constructor called for double,double");
	}
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(b);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor called for String,String");
	}
	
	public void doSum() {
		System.out.println("A value is : "+ this.a);
		System.out.println("B value is : "+ this.b);
		System.out.println("Sum is : "+(this.a + this.b));
	}
}
