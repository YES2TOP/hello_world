import kr.tpc.BookDTO;

public class TPC10 {

	public static void main(String[] args) {
		//int, float, char, boolean-> primitive data type (PDT)
		int a;
		a=10;
		
		//customize book data type (BookDTO) --> class
		BookDTO b=new BookDTO();
		
		b.title="java";
		b.price=17000;
		b.company="Youngjin";
		b.page=630;
		
		System.out.print(b.title+"\t");
		System.out.print(b.price+"\t");
		System.out.print(b.company+"\t");
		System.out.println(b.page+"\t");
	}

}
