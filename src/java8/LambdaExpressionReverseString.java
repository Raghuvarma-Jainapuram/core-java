package java8;

interface StringReversing{
	String reverse(String s);
}

public class LambdaExpressionReverseString {

	public static void main(String[] args) {
		StringReversing rs = (String s)->
		{
			String rev = "";
			for(int i=s.length()-1; i>=0;i--) {
				char c = s.charAt(i);
				rev += c;
			}
			return rev;
		};
		System.out.println("Alphabets: A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
		System.out.println("Alphabets in Reverse Order: "+rs.reverse("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z"));

	}

}
