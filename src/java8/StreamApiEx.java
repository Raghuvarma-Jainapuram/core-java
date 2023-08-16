package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiEx {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(21);
		list.add(32);
		list.add(47);
		list.add(56);
		list.add(69);
		list.add(78);
		
		System.out.println("List: "+list);
		List<Integer> even = list.stream().filter(a->a%2==0).collect(Collectors.toList());
		System.out.println("Even Numbers list: "+even);
		List<Integer> odd = list.stream().filter(a->a%2!=0).collect(Collectors.toList());
		System.out.println("Odd Numbers list: "+odd);
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		int sum = list1.stream().map(x->x*x).reduce((x,y)->x+y).get();
		System.out.println("List1: "+list1);
		System.out.println("Sum of List1: "+sum);

	}

}
