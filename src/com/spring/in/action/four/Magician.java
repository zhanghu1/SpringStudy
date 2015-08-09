package com.spring.in.action.four;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author 		zhanghu1
 * @date   		2015��8��9��
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
	 * ע�⣬����Ĳ������ݲ���ʹ�� and �����Ӳ���������ԭ���Ҳ����������������Ϊ����
	 * ��java���룬��������xml�ļ���
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

