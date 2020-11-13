import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtil;

public class TPC18 {

	public static void main(String[] args) {
		// 1.Java Default Class...API
		// String
		
		String str=new String("APPLE");
		System.out.println(str.toLowerCase()); //apple
		
		// 2.customizable class... DTO/VO, DAO, Utility...API
		MyUtil my=new MyUtil();
		int sum=my.hap();
		System.out.println(sum);
		
		//3. outsourcing class...API
		//Gson->json :mvnrepository.com
		Gson g =new Gson();
		BookVO vo=new BookVO("JAVA", 13000, "YOUNGJIN", 800);
		String json=g.toJson(vo);
		
		System.out.println(json);
	}

}
