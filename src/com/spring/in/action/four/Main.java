package com.spring.in.action.four;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 		zhanghu1
 * @date   		2015年8月8日
 * @fileName	Main.java
 * @packageName	com.spring.in.action.three
 * @projectName SpringStudy
 * @Company		Xiaomi
 */

public class Main {
	
//	private static Performer performer;
	private static Thinker thinker;
	private static MindReader mindReader;
//	private static Audiencex audiencex;
	
	public static void main(String[] args) {
		/**
		 * 这一条语句是一定需要的，它的目的是指明程序是需要Spring容器的，是Spring容器
		 * 启动的语句
		 * */
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-four.xml");
		
//		performer = (Performer) ctx.getBean("bruce");
//		performer.performer();
		thinker = (Thinker) ctx.getBean("volunteer");
		mindReader = (MindReader) ctx.getBean("magician");
		thinker.thinkOfSomething("NICE...NICE...NICE...");
		System.out.println(mindReader.getThoughts());
//		
//		audiencex = (Audiencex) ctx.getBean("audiencex");
//		audiencex.takeSeats();
		
		((AbstractApplicationContext) ctx).close();
	}
}

