package basic;

public class PrimeNumbersUpto50 {

	public static void main(String[] args) {
		for(int i=2; i<=50; i++) {
			int count = 0;
			for(int j=1; j<i; j++) {
				if(i % j == 0) {
					count += 1;
					if(count >= 2) {
						break;
					}
				}
			}
			if(count < 2) {
				System.out.println(i);
			}
		}
	}
}
