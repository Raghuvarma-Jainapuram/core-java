package ass1;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestNumberInArray { // Source

	public static int getSecondSmallest(int []arr) {
		Arrays.sort(arr);
		return arr[1];
	}

	public static void main(String[] args) {
//		int[] arr = {23 , 45,32 , 22, 20, 96};
//		System.out.println(getSecondSmallest(arr));
		String str;
		String[] a;
		int[] arr;
		Scanner s = new Scanner(System.in);
		str = s.nextLine();
		str = str.replaceAll("\\s+", "");
		a = str.split(",");
		
		arr = new int[a.length];
		for(int i=0;i<a.length;i++) {
			arr[i] = Integer.parseInt(a[i]);
		}
		System.out.println(getSecondSmallest(arr));
	}

}
