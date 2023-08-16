package collections;
import java.util.HashSet;
import java.util.Iterator;
public class IteratorHasNextEx {

	public static void main(String[] args) {
		HashSet<String> Technologies = new HashSet<>();
		// Below lines of code will add element to HashSet
		Technologies.add("HTML");
		Technologies.add("CSS");
		Technologies.add("Core Java");
		Technologies.add("Python");
		Technologies.add("SQL");
		//Below line of code will remove element from HashSet
		Technologies.remove("HTML");
		
		System.out.println(Technologies);
		Iterator i = Technologies.iterator();
		while(i.hasNext()) {
			String nameOfCourse=(String)i.next();
			System.out.println(nameOfCourse);
		}
	}

}
