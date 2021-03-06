package com.spring.in.action.three;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author 		zhanghu1
 * @date   		2015年8月8日
 * @fileName	_Instrumentalist.java
 * @packageName	com.spring.in.action.three
 * @projectName SpringStudy
 * @Company		Xiaomi
 */

public class _Instrumentalist implements Performer{

	public _Instrumentalist() {
		
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
	 * 这里我在测试的时候，没有加上@Qualifier的情况下，存在多个Bean时没有抛出异常
	 * 具体的原因我猜测可能是byType失败时，会按照byName的方式寻找，恰好找到了一个
	 * 与参数名字相同的Bean Id，所以可以正确执行了
	 * */
	@Autowired
	@MyAnnotation
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	private Instrument instrument;
	
	
}

