package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("Raghu");
		a.add("");
		a.add(1, "R");
		a.add("varma");
		
		a.set(1,"raghu");
		a.remove(2);
		a.remove("varma");
//		a.add(4);
		System.out.println(a);
		System.out.println(a.size());
		ArrayList<String> b = new ArrayList<>();
		b.addAll(a);
		System.out.println(b);
		
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Elan", "Raghu","RK","Ranjith", "Sudhakar","Arun","Naveen","Mamatha", "Raghu","RK","Ranjith"));
		System.out.println(arrayList);
		ArrayList<Integer> c = new ArrayList<>();
		c.add(4);
		c.add(0);
		c.set(1, 3);
		System.out.println(c);
		List<String> s=new ArrayList<>();
		s.addAll(arrayList);
		
		System.out.println(s);
		System.out.println(s);
		Collections.sort(s);
		System.out.println(s);
//		Collections.sort(Comparator.reverseOrder());
		System.out.println();
	}

}
