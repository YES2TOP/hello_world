import java.util.*;
import kr.tpc.BookDTO;

public class TPC38 {
	public static void main(String[] args) {
		List<BookDTO> list =new ArrayList<BookDTO>(1);
		list.add(new BookDTO("JAVA", 12000, "EASYS", 600));
		list.add(new BookDTO("C", 17000, "ACON", 700));
		list.add(new BookDTO("PYTHON", 15000, "J PUB", 690));

		for(int i=0;i<list.size(); i++) {
			Object o=list.get(i);
			BookDTO vo=(BookDTO)o;
			System.out.println(vo.title+"\t"+vo.price+"\t"+vo.company+"\t"+vo.page);
		}
	}
}
