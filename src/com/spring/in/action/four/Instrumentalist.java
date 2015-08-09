package com.spring.in.action.four;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 		zhanghu1
 * @date   		2015Äê8ÔÂ8ÈÕ
 * @fileName	Instrumentalist.java
 * @packageName	com.spring.in.action
 * @projectName SpringStudy
 * @Company		Xiaomi
 */

@Component("bruce")
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

	@Value("LOVE")
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
	
	@Autowired
	@Qualifier("piano")
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	private Instrument instrument;
	
	
}

