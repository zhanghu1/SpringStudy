package com.spring.in.action;

/**
 * @author 		zhanghu1
 * @date   		2015Äê8ÔÂ8ÈÕ
 * @fileName	Carl_SpEL.java
 * @packageName	com.spring.in.action
 * @projectName SpringStudy
 * @Company		Xiaomi
 */

public class Carl_SpEL implements Performer{

	public void performer() {
		// TODO Auto-generated method stub
		System.out.println("Car_SpEL...Play..." + song);
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	private String song;
	
}

