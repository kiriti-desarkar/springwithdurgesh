package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Jalebi {
	private String shape;

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		return "Jalebi [shape=" + shape + "]";
	}
	
	@PostConstruct
	public void hello() {
		System.out.println("hello method of Jalebi");
	}
	
	@PreDestroy
	public void bye() {
		System.out.println("Bye method of Jalebi");
	}

}
