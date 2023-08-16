package ass1;

import java.util.stream.Stream;

public class Stream_anyMatch {

	public static void main(String[] args) {
		boolean b = Stream.of("Alice","Bob").anyMatch(s->{
//			System.out.println(s); 6pr
			return s.startsWith("A");
		});
		if(b) System.out.println("Alice");
		else System.out.println("Bob");

	}

}
