package practiceEx;

public class EvenPositionElements {

	public static void main(String[] args) {
		int[] arr = {42,3,5,7,23,24,45,91,56,8};
		int sum=0;
		for(int i=1;i<arr.length;i++) {
			if(i%2==1) {
				System.out.println(arr[i]);
				sum += arr[i];}
		}
		System.out.println("Sum: "+sum);

	}

}
