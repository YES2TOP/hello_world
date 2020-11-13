package kr.poly;
import java.lang.*;

public class A extends Object {

	public A() {
		super();
	}

	public void display() {
		System.out.println("I am 'A'!");
	}

	//toString() override
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Overrided String Method!";
	}
	
	
}
