package com.spring.in.action.three;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author 		zhanghu1
 * @date   		2015��8��8��
 * @fileName	__Instrumentalist.java
 * @packageName	com.spring.in.action.three
 * @projectName SpringStudy
 * @Company		Xiaomi
 */

/**
 * ��������ʾ��ָ�����Bean��id = "__kenny"
 * */
@Component("__kenny")
public class __Instrumentalist implements Performer{

	public __Instrumentalist() {
		
	}

	public void performer() {
		// TODO Auto-generated method stub
		System.out.println("Playing " + song + " : ");
		instrument.play();
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	private String song;
	
	public String screamSong() {
		return song;
	}
	
//	public Instrument getInstrument() {
//		return instrument;
//	}
	
	/**
	 * �������ڲ��Ե�ʱ��û�м���@Qualifier������£����ڶ��Beanʱû���׳��쳣
	 * �����ԭ���Ҳ²������byTypeʧ��ʱ���ᰴ��byName�ķ�ʽѰ�ң�ǡ���ҵ���һ��
	 * �����������ͬ��Bean Id�����Կ�����ȷִ����
	 * */
	@Autowired
	@Qualifier("guitar")
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	private Instrument instrument;
	
	
}

