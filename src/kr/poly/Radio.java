package kr.poly;

public class Radio implements RemoCon {

	@Override
	public void chUp() {
		System.out.println("UP TV Channel");
	}

	@Override
	public void chDown() {
		System.out.println("DOWN TV Channel");
		
	}

	@Override
	public void internet() {
		System.out.println("OFF internet");
		
	}

}
