package java8;

import java.util.Arrays;
import java.util.List;


public class MethodReferenceOperator {
	public static void main(String[] args) {
		List<Integer> intSequence = (List<Integer>) Arrays.asList(1,2,3);
		// intSeq1.forEach(x -> System.out.println(x + var));
		intSequence.forEach(x ->System.out.println(x));
		System.out.println("-------------");
		/*
		 * Replace lambda expression with method reference(::) to improve readability
		 */
		intSequence.forEach(System.out::println);
	}
}
