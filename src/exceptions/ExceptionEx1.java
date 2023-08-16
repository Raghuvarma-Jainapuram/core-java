package exceptions;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try{
			String s="abc";
			int a = Integer.parseInt(s);
			System.out.println("Parsed Integer: " + a);
		}catch(Exception e) {
			System.out.println(e);
		}
		try {
			String s1="111";
			int b = Integer.parseInt(s1);
			System.out.println("Parsed Integer: " + b);
		}catch(Exception e) {
			System.err.println(e);
		}
	}

}
