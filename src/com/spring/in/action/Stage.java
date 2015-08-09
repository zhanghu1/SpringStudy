package com.spring.in.action;

/**
 * @author 		zhanghu1
 * @date   		2015��8��8��
 * @fileName	Stage.java
 * @packageName	com.spring.in.action
 * @projectName SpringStudy
 * @Company		Xiaomi
 */

/**
 * SpringҲ�����Թ�����������һ�������࣬���ڲ�ʵ��ԭ��
 * �ǵ���һ����ľ�̬����
 * */
public class Stage {
	private Stage() {
		
	}
	
	/**
	 * �ӳټ��ص�ʵ�ֲ��ԣ��ǳ��õķ���
	 * */
	private static class StageSingletonHolder {
		/**
		 * ����������static�ģ����ԣ�instanceֻ��new��һ��
		 * */
		static Stage instance = new Stage();
	}
	
	public static Stage getInstance() {
		return StageSingletonHolder.instance;
	}
}

