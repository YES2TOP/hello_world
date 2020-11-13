import kr.poly.*;

public class TPC27 {

	public static void main(String[] args) {
		//RemoCon make TV class operate
		RemoCon r=new TV();
		for(int i=0; i<40; i++) {
			r.chUp();
		}
//		r.chUp();
		for(int i=0; i<40; i++) {

			r.chDown();
		}
		r.internet();
		
	}

}
