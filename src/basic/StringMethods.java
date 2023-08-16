package basic;

/*
 * 
 * charAt()              --> Returns the character at the specified index
 * codePointAt()         --> Returns the Unicode of the character at the specified index
 * codePointBefore       --> Returns the Unicode of the character before the specified index
 * codePointCount()      --> Returns the number of Unicode values found in a string.
 * /compareTo()           --> Compares two strings lexicographically
 * /compareToIgnoreCase() --> Compares two strings lexicographically, ignoring case differences
 * concat()              --> Appends a string to the end of another string
 * contains()            --> Checks whether a string contains a sequence of characters
 * contentEquals()       --> Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer
 * /copyValueOf()         --> Return a String that represents certain characters of a char array
 * endsWith()            --> Checks whether a string ends with the specified character(s)
 * equals()              --> Compares two strings
 * equalsIgnoreCase()    --> Compares two strings, ignoring case considerations
 * /format()	             --> Returns a formatted string using the specified locale, format string, and arguments
 * /getBytes()	         --> Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array
 * 
 * indexOf()	         --> Returns the position of the first found occurrence of specified characters in a string
 * 
 * isEmpty()	         --> Checks whether a string is empty or not
 * lastIndexOf()	     --> Returns the position of the last found occurrence of specified characters in a string
 * length()	             --> Returns the length of a specified string
 * 
 * replace()	         --> Searches a string for a specified value, and returns a new string where the specified values are replaced	
 * replaceFirst()	     --> Replaces the first occurrence of a substring that matches the given regular expression with the given replacement
 * replaceAll()	         --> Replaces each substring of this string that matches the given regular expression with the given replacement
 * split()	             --> Splits a string into an array of substrings
 * startsWith()	         --> Checks whether a string starts with specified characters
 * subSequence()	     --> Returns a new character sequence that is a subsequence of this sequence
 * substring()	         --> Returns a new string which is the substring of a specified string
 * /toCharArray()	     --> Converts this string to a new character array
 * toLowerCase()	     --> Converts a string to lower case letters
 * /toString()	         --> Returns the value of a String object
 * toUpperCase()	     --> Converts a string to upper case letters
 * trim()	             --> Removes whitespace from both ends of a string
 * /valueOf()	         --> Returns the string representation of the specified value
 */


public class StringMethods {

	public static void main(String[] args) {
		String s1="Raghuvarma";
		String s2 = new String();
		s2="Jainapuram";
		
		System.out.println("charAt 5 : "+s1.charAt(5));
		System.out.println("codePointAt 2 : "+s1.codePointAt(2));
		System.out.println("codePointBefore 1 : "+s1.codePointBefore(1));
		System.out.println("codePointCount from 2 to 5 : "+s1.codePointCount(2,5));
		//System.out.println("compareTo : "+s1.compareTo("ghu"));
		//System.out.println("compareToIgnoreCase : "+s1.compareToIgnoreCase("VAR"));
		System.out.println("Cancat : " + s1.concat(" Jainapuram")); //s1.concat(s2)
		System.out.println("contains of ghu : " +s1.contains("ghu"));
		System.out.println("contentEquals of ghu: "+s1.contentEquals("ghu"));
		System.out.println("endsWith : "+s1.endsWith("ma"));
		System.out.println("equals : " + s1.equals(s2));
		System.out.println("equalsIgnoreCase : " + s1.equalsIgnoreCase(s2));
		System.out.println("indexOf of u : " +s1.indexOf('u'));
		System.out.println("isEmpty : "+s1.isEmpty());
		System.out.println("lastIndexOf of r : " +s1.lastIndexOf('r'));
		System.out.println("length of String s1 : " + s1.length());
		System.out.println("replace String : " +s1.replace("Raghuvarma", "raghu"));
		System.out.println("replaceFirst : "+s1.replaceFirst("Raghu", "RAGHU"));
		System.out.println("replaceAll of a : "+s1.replaceAll("a", "A"));
		String s3 = "How are you?";
		String arrStr[] = s3.split(" ", 3);
		System.out.print("split : ");
		for(int i=0;i<arrStr.length;i++) {
			System.out.print(arrStr[i] + " ");
		}
		System.out.println();
		System.out.println("startsWith : "+s1.startsWith("Ra"));
		System.out.println("SubSequence of a string : " +s1.subSequence(2,5));
		System.out.println("Substring of a string : " +s1.substring(2,5));
		System.out.println("toLowercase : " + s1.toLowerCase());
		System.out.println("toUppercase : " + s1.toUpperCase());
		String s4 = "  RAGHU ";
		System.out.println("trim : " + s4.trim());
		
		
		
//		System.out.println();
//		System.out.println("Splited Elements using for each loop:");
//			for (String str5 : arrStr) {
//				System.out.print(str5 + " ");
//			}

	}

}
