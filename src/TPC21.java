import kr.tpc.*;

public class TPC21 {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		
		Cat c=new Cat();
		c.eat();
		c.night();
		
		//provided, Dog.class & Cat.class not Dog.java & Cat.java
		Animal ani_d=new Dog(); //upcasting
		ani_d.eat();
		
		Animal ani_c=new Cat();
		ani_c.eat();
		((Cat)ani_c).night();//downcasting
		
		
	}

}
