package basic;

public class CharArraay {
	public static void main(String[] args) {
		String str= "Welcome to Edubridge";
		// converting string to character array
		char[] arr = str.toCharArray();
		System.out.println(arr);
		String newStr="";
		for(char c:arr) {
			if(c ==' ') {
				c='-';
			}
			newStr += c;
			System.out.println(newStr);
		}
	}
}
