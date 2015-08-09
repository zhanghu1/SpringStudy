package com.spring.in.action.four;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * @author 		zhanghu1
 * @date   		2015年8月8日
 * @fileName	Audience.java
 * @packageName	com.spring.in.action.four
 * @projectName SpringStudy
 * @Company		Xiaomi
 */

@Component
public class Audience {
	
	public void takeSeats() {
		System.out.println("The Audience is taking their seats...");
	}
	
	public void turnOffCellPhones() {
		System.out.println("The Audience is turning off their cellphones...");
	}
	
	public void applaud() {
		System.out.println("CLAP...CLAP...CLAP...");
	}
	
	public void demandRefund() {
		System.out.println("BOO! We want our money back...");
	}
	
	public void watchPerformance(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("The audience is taking their seats");
			System.out.println("The audience is turning off their cellphone");
			
			long start = System.currentTimeMillis();
			joinpoint.proceed();	//控制权需要转交给被通知方法
			long end = System.currentTimeMillis();
			
			System.out.println("CLAP CLAP CLAP CLAP");
			System.out.println("The performance took " + (end - start) + "milliseconds.");
		} catch(Throwable t) {
			System.out.println("Bob! We want our money abck!");
		}
	}

}

