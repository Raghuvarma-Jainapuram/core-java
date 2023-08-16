package collections;
import java.util.HashMap;
public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "ABC");
		hm.put(2, "ABC");
		hm.put(2, "PQR");
		hm.putIfAbsent(3, "XYZ");
		hm.putIfAbsent(3, "PQR");
		System.out.println("Hash Map : " + hm);
	}

}
