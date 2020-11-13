package kr.poly;

public abstract class Animal {//abstract "class" ===> Too general, Too abstract
//Dog, Cat---->eat()
	public abstract void eat(); //abstract "method" ===> Too general, Too abstract
	
	public void move() {
		System.out.println("Animal Move Together");
	}

}
