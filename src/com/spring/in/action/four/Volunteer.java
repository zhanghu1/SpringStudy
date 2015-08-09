package com.spring.in.action.four;

import org.springframework.stereotype.Component;

/**
 * @author 		zhanghu1
 * @date   		2015Äê8ÔÂ9ÈÕ
 * @fileName	Volunteer.java
 * @packageName	com.spring.in.action.four
 * @projectName SpringStudy
 * @Company		Xiaomi
 */

@Component
public class Volunteer implements Thinker{

	private String thought;
	
	public void thinkOfSomething(String thoughts) {
		// TODO Auto-generated method stub
		this.thought = thoughts;
	}
	
	public String getThoughts() {
		return thought;
	}

}
