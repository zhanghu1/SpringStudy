package com.spring.in.action.three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 		zhanghu1
 * @date   		2015Äê8ÔÂ8ÈÕ
 * @fileName	Main.java
 * @packageName	com.spring.in.action.three
 * @projectName SpringStudy
 * @Company		Xiaomi
 */

public class Main {
	
	private static Performer performer;
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-three.xml");
		
		performer = (Performer) ctx.getBean("__kenny");
		performer.performer();
		
		((AbstractApplicationContext) ctx).close();
	}
}

