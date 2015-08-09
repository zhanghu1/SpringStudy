package com.spring.in.action;

/**
 * @author 		zhanghu1
 * @date   		2015Äê8ÔÂ8ÈÕ
 * @fileName	Instrumentalist.java
 * @packageName	com.spring.in.action
 * @projectName SpringStudy
 * @Company		Xiaomi
 */

public class Instrumentalist implements Performer{
	
	public Instrumentalist() {
		
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

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	private Instrument instrument;
	
	
}

