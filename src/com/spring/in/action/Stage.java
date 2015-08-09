package com.spring.in.action;

/**
 * @author 		zhanghu1
 * @date   		2015年8月8日
 * @fileName	Stage.java
 * @packageName	com.spring.in.action
 * @projectName SpringStudy
 * @Company		Xiaomi
 */

/**
 * Spring也可以以工厂方法创建一个单例类，其内部实现原理
 * 是调用一个类的静态方法
 * */
public class Stage {
	private Stage() {
		
	}
	
	/**
	 * 延迟加载的实现策略，非常好的方法
	 * */
	private static class StageSingletonHolder {
		/**
		 * 由于声明是static的，所以，instance只是new了一次
		 * */
		static Stage instance = new Stage();
	}
	
	public static Stage getInstance() {
		return StageSingletonHolder.instance;
	}
}

