package com.spring.in.action.four;

import org.springframework.stereotype.Component;

/**
 * @author 		zhanghu1
 * @date   		2015Äê8ÔÂ8ÈÕ
 * @fileName	Piano.java
 * @packageName	com.spring.in.action
 * @projectName SpringStudy
 * @Company		Xiaomi
 */

@Component
public class Piano implements Instrument{

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Piano...PLINK...PLINK...");
	}
	
	public Piano() {
		
	}

}

