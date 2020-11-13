import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC22 {

	public static void main(String[] args) {
		//upcasting
		Animal ani=new Cat();
		//Cat ani=new Cat();
		//Object ani=new Cat();
		ani.eat(); //Compile time->Animal, Runtime->Dog
	
		
		//ani.night()
		//Cat c=(Cat)ani;
		//c.night();
		((Cat)ani).night();
		
		ani=new Dog();
		ani.eat();
		//polymorphism
		//parent class Vs. child class
		
		Object o=new Dog();
		//o.eat();
		((Dog)o).eat();
		
	
	}
	

}
