import kr.tpc.*;

public class TPC29 {

	public static void main(String[] args) {
		A a=new A();
		display(a);

		B b=new B();
		display(b);
	}

	private static void display(Object o) { //Factor of Polymorphism
		if(o instanceof A) {
		((A)o).go();
		} else {
		((B)o).go();
		}
	}
}
