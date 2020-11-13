
public class TPC39 {

	public static void main(String[] args) {
		int a =1;
//		Integer b=new Integer(1); //wrapping in normal
		Integer b=1;      //Boxing
		System.out.println(b.intValue());
		System.out.println(b.toString());

		System.out.println();
		
		Object[] obj=new Object[3];
		//1,2,3
		obj[0]=new Integer(1);
		obj[1]=new Integer(2);
		obj[2]=new Integer(3);
		
		System.out.println(obj[0].toString());
		System.out.println(obj[1].toString());
		System.out.println(obj[2].toString());
		System.out.println();

		System.out.println(obj[0]);
		System.out.println(obj[1]);
		System.out.println(obj[2]);
		System.out.println();
	
		
		//"100"+"1OO"=200  : char 100 + char 100= int 100 can we do it?
		String x="100";
		String y="100";
		System.out.println(x+y);
		System.out.println();
		
		int v1=Integer.parseInt(x);
		int v2=Integer.parseInt(y);
		System.out.println(v1+v2);
		System.out.println();
		
		//100+1OO="100100"  : int 100 + int 100= char 100100 can we do it?
		
		String s1=String.valueOf(v1);
		String s2=String.valueOf(v2);
		System.out.println(s1+s2);
		
		
	}

}
