package com.spring.in.action.four;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 		zhanghu1
 * @date   		2015��8��8��
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
		 * ��һ�������һ����Ҫ�ģ�����Ŀ����ָ����������ҪSpring�����ģ���Spring����
		 * ���������
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

