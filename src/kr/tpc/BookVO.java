package kr.tpc;
//책(Object)->제목, 가격, 출판사, 페이지수.....
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	//default constructor hiding
	public BookVO() {
		//초기화 작업
		this.title="java";
		this.price=14000;
		this.company="Easys";
		this.page=780;
	}
	
	//overloading of constructor method
	public BookVO(String title, int price, String company, int page){
		//초기화 작업
		this.title=title;
		this.price=price;
		this.company=company;
		this.page=page;
	}
}
