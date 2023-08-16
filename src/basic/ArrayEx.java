package basic;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayEx {

	public static void main(String[] args) {
		// data type[] arrayName = new data type[size]

		System.out.println("1 D-Array :\n---------");
		int arr1[]= {1,2,3,4,5};
		int arr2[]=arr1.clone();                // 1 D-array --> deep copy
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println(arr1==arr2);         // different memory allocation
		System.out.println(arr1);
		System.out.println(arr2);


		System.out.println("2 D-Array :\n---------");
		int arr3[][]= {{1,2,3},{4,5,6,7},{8,9},{10,11,12,13,14}}; 
		int arr4[][]=arr3.clone();              // 2 D-array --> shallow copy
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++){
				System.out.print(arr3[i][j] +" ");
			}
			System.out.println();
		}            
		System.out.println(arr3[0]==arr4[0]);  // same memory allocation
		System.out.println(arr3[1]==arr4[1]);
		System.out.println(arr3[0]);
		System.out.println(arr4[0]);

		ArrayList<String> itemName = new ArrayList<String>();
		ArrayList<Integer> itemPrice = new ArrayList<Integer>();

		itemName.add("Chicken Biryani Single  -  120");
		itemPrice.add(120);
		System.out.println(itemName+"+"+itemPrice);
		itemName.add("Chicken Biryani Full  -  230");
		itemPrice.add(230);
		System.out.println(itemName+"+"+itemPrice);
		itemName.add("Chicken Biryani Family Pack  -  450");
		itemPrice.add(450);
		System.out.println(itemName+"+"+itemPrice);
		Iterator<String> i = itemName.iterator();
		while(i.hasNext()) {
			String nameOfCourse=(String)i.next();

			System.out.println(nameOfCourse);
		}
		int c=0;
		Iterator<Integer> j = itemPrice.iterator();
		while(j.hasNext()) {
			int nameOfCourse=(int)j.next();
			c+=nameOfCourse;
		}
		System.out.println("Total bill:                  " + c);
		ArrayList<Integer> pr = new ArrayList<Integer>();
		int a=0;
		for(int k=0;k<20;k++) {
			if(k%2!=0) {
				if(k%3!=0) {
					pr.add(k);
					a+=k;
				}
			}
		}
		System.out.println(pr+"  "+a);
	}

}

