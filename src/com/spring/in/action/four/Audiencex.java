package com.spring.in.action.four;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author 		zhanghu1
 * @date   		2015��8��9��
 * @fileName	_Audience.java
 * @packageName	com.spring.in.action.four
 * @projectName SpringStudy
 * @Company		Xiaomi
 */

@Aspect
@Component
public class Audiencex {
	@Pointcut("execution(* com.spring.in.action.four.Performer.performer(..))")
	public void performance() {	//�������Ϊ�е�����ƣ����Լ�����ģ��������ȡ�Ϳ���
		
	}
		@Before("performance()")
		public void takeSeats() {
			System.out.println("!!!!!The Audience is taking their seats!!!!!");
		}
		
		@Before("performance()")
		public void turnOffCellPhones() {
			System.out.println("The Audience is turning off their cellphones...");
		}
		
		@AfterReturning("performance()")
		public void applaud() {
			System.out.println("!!!!!CLAP...CLAP...CLAP...!!!!!");
		}
		
		@AfterThrowing("performance()")
		public void demandRefund() {
			System.out.println("!!!!!BOO! We want our money back...!!!!!");
		}
		
		@Around("performance()")
		public void watchPerformance(ProceedingJoinPoint joinpoint) {
			try {
				System.out.println("The audience is taking their seats");
				System.out.println("The audience is turning off their cellphone");
				
				long start = System.currentTimeMillis();
				joinpoint.proceed();	//����Ȩ��Ҫת������֪ͨ����
				long end = System.currentTimeMillis();
				
				System.out.println("CLAP CLAP CLAP CLAP");
				System.out.println("The performance took " + (end - start) + "milliseconds.");
			} catch(Throwable t) {
				System.out.println("Bob! We want our money abck!");
			}
		}


}

