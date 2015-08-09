package com.spring.in.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
//	private static Juggler juggler;
//	private static PoeticJuggler poeticJuggler;
	
	public static void main(String[] args) {
		/**
		 * ApplicationContext是容器的一种实现，BeanFactory也是Spring容器的一种
		 * 实现，不过比较简单，我们一般使用ApplicationContext作为Spring容器使用
		 * */
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
//		juggler = (Juggler) ctx.getBean("duke");
//		juggler.performer();
//		poeticJuggler = (PoeticJuggler)ctx.getBean("poeticDuke");
//		poeticJuggler.perform();
//		
//		Performer performer = (Performer)ctx.getBean("kenny");
//		performer.performer();
		
		Performer performer = (Performer)ctx.getBean("carl_SpEL");
		performer.performer();
		
		((AbstractApplicationContext) ctx).close();
	}
}
