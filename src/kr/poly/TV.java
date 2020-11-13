package kr.poly;

public class TV implements RemoCon{
	int currCH=70;
	
	@Override
	public void chUp() {
		if(currCH<RemoCon.MAXCH) {
		currCH++;
			System.out.println("UP TV Channel: "+currCH);
		}else {
			currCH=1;
			System.out.println("UP TV Channel: "+currCH);
		}
	}

	@Override
	public void chDown() {
		if(currCH > RemoCon.MINCH) {
		currCH--;
			System.out.println("DOWN TV Channel.: "+currCH);
		}
		else {
			currCH=100;
			System.out.println("DOWN TV Channel.: "+currCH);
		}
	}

	@Override
	public void internet() {
		System.out.println("ON internet");
	}
}