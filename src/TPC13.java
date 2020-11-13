import kr.tpc.BookDTO;

public class TPC13 {

	public static void main(String[] args) {
		// BOOK-> class(BookDTO)->object->instance
		String title="Spring";
		int price=25000;
		String company="J pub";
		int page=890;
		
		BookDTO dto;
		dto=new BookDTO(title, price, company, page);
	
		bookPrint(dto);
	}
	
	public static void bookPrint(BookDTO dto) {
		System.out.print(dto.title+"\t");
		System.out.print(dto.price+"\t");
		System.out.print(dto.company+"\t");
		System.out.println(dto.page+"\t");
	}
}
