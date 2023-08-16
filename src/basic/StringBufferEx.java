package basic;

/*
 1.append()        --> Adding the text at the end of the existing text
 2.charAt()        --> Returns the char value at the specified index
 3.capacity()      --> Total allocated capacity 
 4.delete()        --> Deletes sequence of characters between two indices
 5.deleteCharAt()  --> Deletes the Character at the specified index
 6.ensureCapacity()--> Ensures capacity is at least equals to the given minimum.
 7.insert()        --> Insert text at the specified index position ==>insert(index, String)
 8.length()        --> Returns a length of a string
 9.replace()       --> Replace set of characters between two specified indices
 10.reverse()      --> Reverse the characters
 */
public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Cooking "); 
		System.out.println(str);
		
		// append()
		str.append("Emerging ");
		System.out.println(str);
		// charAt()
		System.out.println(str.charAt(4));
		// capacity()
		System.out.println(str.capacity()); // Method capacity before ensureCapacity
		// delete()
		System.out.println(str.delete(3, 6));
		// deleteCharAt()
		System.out.println(str.deleteCharAt(0));
		// ensureCapacity()
		str.ensureCapacity(50);
		System.out.println(str.capacity()); // Method capacity after ensureCapacity
		// insert()
		str.insert(13, "Technology");  
		System.out.println(str);
		// length()
		System.out.println(str.length());
		// replace()
		str.replace(4, 13, "IoT"); 
		System.out.println(str);
		// reverse()
		System.out.println(str.reverse()); 
		
		StringBuffer s = new StringBuffer();// default capacity
		System.out.println(s.capacity());
	}
}
