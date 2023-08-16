 package collections;
import java.util.Stack;
public class StackEx {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		System.out.println("Is Emply:"+s.isEmpty());
		s.push("Raghu");
		s.push("varma");
		System.out.println("String s after push:"+s);
		System.out.println("Is Emply:"+s.isEmpty());
		s.pop();
		System.out.println("String s after pop:"+s);
		s.push("RK");
		s.push("Mamatha");
		s.push("Ranjith");
		String peek = s.peek();
		System.out.println("String s after peek:"+s);
		System.out.println("Peek:"+peek);
		int position_M = s.search("Mamatha");
		System.out.println("Position of Mamatha:"+position_M);
		int position_R = s.search("lokesh");
		System.out.println("Position of lokesh:"+position_R);
		s.add("arun");
		s.add("Raghu");
		s.add("Ranjith");
		int position_a = s.search("Ranjith");
		System.out.println("Position of Ranjith:"+position_a);
		System.out.println("String s:"+s);
		System.out.println("Index of Raghu:"+s.indexOf("Raghu"));
		System.out.println("Last Index of Raghu:"+s.lastIndexOf("Raghu"));
	}

}
