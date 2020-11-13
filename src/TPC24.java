import kr.tpc.*;

public class TPC24 {

	public static void main(String[] args) {
		//polymorphism array
		//Create arrays for Dog, and Cat
		
		Animal[] ani=new Animal[2];
		ani[0]=new Dog();
		ani[1]=new Cat();
		
		for(int i=0;i<ani.length;i++) {
			ani[i].eat();
//			((Cat)ani[i]).night();

//			((Cat)ani[1]).night();
			if(ani[i] instanceof Cat) {
				((Cat)ani[i]).night();
			}
			display(ani);
		}
		

	}

	private static void display(Animal[] ani) {
		for(int i=0;i<ani.length;i++) {
			ani[i].eat();
//			((Cat)ani[i]).night();

//			((Cat)ani[1]).night();
			if(ani[i] instanceof Cat) {
				((Cat)ani[i]).night();
			}
			
		}

	}
}