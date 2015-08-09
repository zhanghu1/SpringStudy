package com.spring.in.action;

/**
 * @author 		zhanghu1
 * @date   		2015年8月8日
 * @fileName	Auditorium.java
 * @packageName	com.spring.in.action
 * @projectName SpringStudy
 * @Company		Xiaomi
 */

public class Auditorium {
	/**
	 * 我们需要在这个Bean被实例化的时候立即调用这个初始化方法
	 * 但是方法不能有参数
	 * */
	public void turnOnLights() {
		System.out.println("start : turn on lights...");
	}
	
	/**
	 * 我们需要在这个Bean销毁的时候调用这个方法
	 * 但是方法不能有参数
	 * */
	public void turnOffLights() {
		System.out.println("over : turn off lights...");
	}
}

