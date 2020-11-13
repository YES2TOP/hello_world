import kr.tpc.MovieVO;

public class TPC17 {

	public static void main(String[] args) {
		
		int[] a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		int[] b= {10,20,30,40,50};
		
		int[] c= new int[] {10,20,30,40,50};
		
		for(int i=0; i<b.length; i++){
			System.out.println(b[i]);
		}
		//Movie(title, price, actor, level, time)
		MovieVO mv=new MovieVO("Beat", 12000, "Kim", 12, 1.3f);
		System.out.println(mv.toString());
		
		//3 Movies
		
		MovieVO[] marr=new MovieVO[3];
		marr[0]=new MovieVO("Beat1", 11000, "Lee", 12, 1.3f);
		marr[1]=new MovieVO("Beat2", 13000, "Park", 11, 1.4f);
		marr[2]=new MovieVO("Beat3", 15000, "James", 13, 1.5f);
		
		System.out.println(marr[0].toString());
		System.out.println(marr[1].toString());
		System.out.println(marr[2].toString());
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		for(int i=0;i<marr.length;i++)
			System.out.println(marr[i]);
	}

}
