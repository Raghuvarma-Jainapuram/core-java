import java.util.ArrayList;
import java.util.Scanner;
public class MaxLengthOfArrayElements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arrSize = s.nextInt();
		int[] arr = new int[arrSize];

		for(int i=0; i<arrSize; i++) {
			arr[i] = s.nextInt();
		}
		int[] arr1 = arr.clone();
		int maxDiff = 0;
		for(int i=0; i<arrSize-1; i++) {
			if(arr[i]<arr1[i+1] && maxDiff < arr[i+1]-arr1[i]) {
				maxDiff = arr[i+1] - arr1[i];
			}
			else {
				continue;
			}
		}
		System.out.println(maxDiff);
	}

}
