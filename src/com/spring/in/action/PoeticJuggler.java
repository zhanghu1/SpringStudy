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
		//执行父类的构造方法
		super(beanBags);
		this.poem = poem;
	}
	
	public void perform() {
		//执行父类的方法
		super.performer();
		System.out.println("while reciting...");
		poem.recite();
	}
}
