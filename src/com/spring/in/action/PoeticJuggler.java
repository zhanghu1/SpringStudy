package com.spring.in.action;

/**
 * @author Administrator
 *
 */
public class PoeticJuggler extends Juggler{
	private Poem poem;
	
	public PoeticJuggler(Poem poem) {
		super();
		this.poem = poem;
	}
	
	public PoeticJuggler(int beanBags, Poem poem) {
		//ִ�и���Ĺ��췽��
		super(beanBags);
		this.poem = poem;
	}
	
	public void perform() {
		//ִ�и���ķ���
		super.performer();
		System.out.println("while reciting...");
		poem.recite();
	}
}
