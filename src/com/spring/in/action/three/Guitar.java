package com.spring.in.action.three;

import org.springframework.stereotype.Component;

/**
 * @author 		zhanghu1
 * @date   		2015年8月8日
 * @fileName	Guitar.java
 * @packageName	com.spring.in.action.three
 * @projectName SpringStudy
 * @Company		Xiaomi
 */

/**
 * 由于这里使用了@Component注解，Guitar将会自动的标识为Spring的一个Bean，
 * 且由于这里没有指定Bean的id，那么就会依据类的名字了，只是第一个字母为小写
 * 即Guitar的bean id = "guitar"
 * */
@Component
public class Guitar implements Instrument{

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Guitar...Strum...Strum...");
	}

}

