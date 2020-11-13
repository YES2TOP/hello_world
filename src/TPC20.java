import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
	public static void main(String[] args) {
//		Animal d=new Dog();
//		d.eat(); // "?"
		Animal a=new Animal();
		a.eat();
		
		Dog d=new Dog();
		d.eat();
		
		Cat c=new Cat();
		c.eat();
		c.night();
		
		//in case of the Dog.class & Cat.class
		Animal ani=new Dog(); //upcasting(type switch)
		ani.eat(); //? -> Dog eats
		
		ani=new Cat();
		ani.eat();
//		ani.night();
		((Cat)ani).night(); //forced casting & down casting
		}
}
