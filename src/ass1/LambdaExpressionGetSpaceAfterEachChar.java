package ass1;


interface GetSpaceAferEachLetter{
	String getSpace(String s);
}

public class LambdaExpressionGetSpaceAfterEachChar {

	public static void main(String[] args) {
		GetSpaceAferEachLetter space = (String str) -> {
			String result = "";
			for(char ch : str.toCharArray()) {
				if(ch==' ')continue;
				else result = result + ch + " ";
			}
			return result;
		};
		System.out.println(space.getSpace("HELLOWORLD"));

	}

}
