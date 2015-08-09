package com.spring.in.action;

import java.util.Collection;

/**
 * @author 		zhanghu1
 * @date   		2015Äê8ÔÂ8ÈÕ
 * @fileName	OneManBand.java
 * @packageName	com.spring.in.action
 * @projectName SpringStudy
 * @Company		Xiaomi
 */

public class OneManBand implements Performer{

	public OneManBand() {
		
	}
	
	public void performer() {
		// TODO Auto-generated method stub
		for (Instrument instrument : instruments) {
			instrument.play();
		}
	}

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}

	private Collection<Instrument> instruments;
	
	

}

