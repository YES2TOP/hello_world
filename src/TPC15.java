

import kr.tpc.MemberVO;

public class TPC15 {

	public static void main(String[] args) {
		MemberVO m =new MemberVO("Hong", 40, "010-1234-4321", "Seoul");
	
		System.out.println(m.toString());

		MemberVO m1=new MemberVO();
		m1.setName("NaGil");
		m1.setAge(34);
		m1.setTel("020-222-2345");
		m1.setAddr("GwangJu");
		
		System.out.print(m1.getName()+"\t");
		System.out.print(m1.getAge()+"\t");
		System.out.print(m1.getTel()+"\t");
		System.out.println(m1.getAddr());
		
		System.out.println(m1.toString());
		
		System.out.println(m1);
	}

}
