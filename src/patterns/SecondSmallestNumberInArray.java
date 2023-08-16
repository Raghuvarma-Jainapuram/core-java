package patterns;
import java.util.Arrays;
class SmallestNum{
	public int getSecondSmallest(int[] arr) {
		return arr[1];
		
	}
}

public class SecondSmallestNumberInArray {

	public static void main(String[] args) {
		int[] arr = {12,3,5,67};
		Arrays.sort(arr);
		SmallestNum sn = new SmallestNum();
		System.out.println(sn.getSecondSmallest(arr));

	}

}
