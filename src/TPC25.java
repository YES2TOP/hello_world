import kr.poly.*;

public class TPC25 {

	public static void main(String[] args) {
		//eat()--override---->eat()
		//upcasting is a solution
		Animal ani=new Dog();
		ani.eat();
		ani.move();
		
		ani=new Cat();
		ani.eat();
		((Cat)ani).night();
		ani.move();

	}
}
