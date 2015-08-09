package com.spring.in.action.four;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author 		zhanghu1
 * @date   		2015年8月9日
 * @fileName	Magician.java
 * @packageName	com.spring.in.action.four
 * @projectName SpringStudy
 * @Company		Xiaomi
 */

@Aspect
@Component
public class Magician implements MindReader{
	
	private String thoughts;
	
	/**
	 * 注意，这里的参数传递不能使用 and 来连接参数，具体原因我不清楚，不过可能因为这里
	 * 是java代码，而不是在xml文件中
	 * */
	@Pointcut("execution(* com.spring.in.action.four.Thinker.thinkOfSomething(String)) && args(thoughts)")
	public void thinking(String thoughts) {
		
	}
	
	public String getThoughts() {
		// TODO Auto-generated method stub
		return thoughts;
	}

	@Before("thinking(thoughts)")
	public void interceptThoughts(String thoughts) {
		// TODO Auto-generated method stub
		System.out.println("Intercept volunteer's thoughts...");
		this.thoughts = thoughts;
	}

}

