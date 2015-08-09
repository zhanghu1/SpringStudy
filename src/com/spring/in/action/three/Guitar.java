package com.spring.in.action.three;

import org.springframework.stereotype.Component;

/**
 * @author 		zhanghu1
 * @date   		2015��8��8��
 * @fileName	Guitar.java
 * @packageName	com.spring.in.action.three
 * @projectName SpringStudy
 * @Company		Xiaomi
 */

/**
 * ��������ʹ����@Componentע�⣬Guitar�����Զ��ı�ʶΪSpring��һ��Bean��
 * ����������û��ָ��Bean��id����ô�ͻ�������������ˣ�ֻ�ǵ�һ����ĸΪСд
 * ��Guitar��bean id = "guitar"
 * */
@Component
public class Guitar implements Instrument{

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Guitar...Strum...Strum...");
	}

}

