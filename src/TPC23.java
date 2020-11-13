import kr.tpc.*;

public class TPC23 {

	public static void main(String[] args) {
		// 1.Polymorphism factor
		Dog d=new Dog();
		display(d);
				
		Cat c=new Cat();
		display(c);
	} //upcasting
	private static void display(Animal r) { //Polymorphism factor
		r.eat();
		//r.night();
		if(r instanceof Cat) {
		((Cat)r).night(); //downcasting
		}

	}

}