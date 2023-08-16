package ass1;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionFilterCountAndUppercase {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("dffg","fmf","","dfd");
		System.out.println("strList: "+strList);
		
		long count = strList.stream().filter(x->x.isEmpty()).count();
		System.out.println("Count: "+count);

	}

}
