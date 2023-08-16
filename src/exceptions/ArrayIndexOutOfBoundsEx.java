package exceptions;

public class ArrayIndexOutOfBoundsEx {

	public static void main(String[] args) {
		try {
			int[] numArray = {1,2,3,4};
			System.out.println(numArray[0]); // print 1
			System.out.println(numArray[4]); // print catch block
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
