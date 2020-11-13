package kr.tpc;

public class Cat extends Animal{
	//name, age, specimen : status

	public void night() {
		System.out.println("Cat Eye lights in the night");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat eats");
	}
	
}
