package ass1;

import java.util.Arrays;
//import java.util.Collections;
import java.util.Scanner;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i<N; i++) {
			arr[i] = s.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
//		Arrays.sort(arr, Collections.reverseOrder());
//		System.out.println(arr[1]);
	}

}
