package collections;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetExIterator {
	public static void main(String[] args) {
		TreeSet<String> c = new TreeSet<>();
		c.add("Sangli");
		c.add("Mumbai");
		c.add("Satara");
		c.add("Kolhapur");
        //System.out.println(c);
		c.remove("Mumbai");
		c.add("Pune");
		System.out.println(c);
		System.out.println("Retrive data using treeset");
		Iterator<String> iterator = c.descendingIterator();
		while (iterator.hasNext()) {
			String nameOfCity = (String) iterator.next();
			System.out.println(nameOfCity);
		}
	}
}