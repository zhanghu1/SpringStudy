package com.spring.in.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
//	private static Juggler juggler;
//	private static PoeticJuggler poeticJuggler;
	
	public static void main(String[] args) {
		/**
		 * ApplicationContext��������һ��ʵ�֣�BeanFactoryҲ��Spring������һ��
		 * ʵ�֣������Ƚϼ򵥣�����һ��ʹ��ApplicationContext��ΪSpring����ʹ��
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
