package exceptions;

public class CatchAndFinally {

	public static void main(String[] args) {
		try {
			int[] a= {1,2,3,4,5};
			System.out.println(a[3]);
			int s=Integer.parseInt("abc");
			int b=10/0;
			
		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("Number cann't devide by 0");
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block ");
		}

	}

}
