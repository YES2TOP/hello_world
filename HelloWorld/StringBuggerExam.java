
public class StringBuggerExam {

	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("world");
		
		
		String str=sb.toString();
		System.out.println(str);
		
	}

}
