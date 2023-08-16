package basic;

public class WhileAndDoWhileLoopEx {
	public static void main(String[] args) {
		int i=2;
		do {
			System.out.println(i);
			i++;
		}while(i<=1);
//		i=2;
//		while(i<=1) {
//			System.out.println(i);
//		}
		// while loop
		i=1;
		System.out.print("Even numbers : ");
		while(i<=50) {
			if(i%2==0) {
				System.out.print( i + " ");
			}
			i++;
		}
		System.out.println();
		// do-while loop
		i = 1;
		System.out.print("Odd numbers : ");
		do {
			if(i%2!=0) {
				System.out.print(i + " ");
			}
			i++;
		}while(i<=50);
		
	}
}
