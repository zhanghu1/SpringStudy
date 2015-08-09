package com.spring.in.action;

public class Juggler implements Performer{
	
	private int beanBags = 3;
	
	public Juggler() {
		
	}
	
	public Juggler(int beanBags){
		this.beanBags = beanBags;
	}

	public void performer() {
		// TODO Auto-generated method stub
		System.out.println("beanBags : " + beanBags);
	}

}
