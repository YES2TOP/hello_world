package kr.poly;

//abstract is hidden
//object, method is not allowed

//public abstract interface RemoCon {
public interface RemoCon {
	//literal
	int MAXCH=100;
	//same as : public static final int MAXCH=100;
	//RemoCon.MAXCH
	int MINCH=1;
	
	//	public abstract void chUp();
	public void chUp();
	public void chDown();
	public void internet();
}