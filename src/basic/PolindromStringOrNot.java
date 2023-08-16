package basic;

public class PolindromStringOrNot {
	public static void main(String[] args) {
		System.out.println("Reversing a String : ");
		String s = "Malayalam";
		String reversedS = "";
		for(int i=s.length()-1;i>=0; i--) {
			reversedS = reversedS + s.charAt(i);			
		}
		System.out.println("String s : "+s+", "+"Reversed String s : " + reversedS);
		if(s.equals(reversedS)) {
			System.out.println("Polindrom String");
		}else {
			System.out.println("Not a Polindrom String");
		}
		System.out.println();
		
		//System.out.println(Math.pow(153,3));
		System.out.println("Reversing a String using StringBuffer : ");
		String s1 = "malayalam";
		StringBuffer buffers1 = new StringBuffer(s1);
		StringBuffer reversedBuffers1 = buffers1.reverse();
		System.out.println("String s1 : "+s1+", "+"Reversed String s1 : " + buffers1);
		if(buffers1.equals(reversedBuffers1)) {
			System.out.println("Polindrom String");
		}else {
			System.out.println("Not a Polindrom String");
		}
		System.out.println();
		
		System.out.println("Reversing a String using StringBuilder : ");
		String s2="ABCD";
		StringBuilder builder2 = new StringBuilder(s2);
		StringBuilder reversedBuilder2 = builder2.reverse();
		System.out.println("String s2 : "+s2+", "+"Reversed String s2 : " + builder2);
		if(builder2.equals(reversedBuilder2)) {
			System.out.println("Polindrom String");
		}else {
			System.out.println("Not a Polindrom String");
		}
	}
}
