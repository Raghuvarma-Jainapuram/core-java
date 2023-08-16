package oops;

public class ThisKeywordConstructor {
	ThisKeywordConstructor(){ 
		this(2); // call single parameterized constructor
		System.out.println("Default Constructor.");
	} 
	ThisKeywordConstructor(int i){ 
		this(2,3); // call two parameterized constructor
		System.out.println("Constructor with one argument."); 
	} 
	ThisKeywordConstructor(int i, int j){ 
		this(2,3,4); // call three parameterized constructor
		System.out.println("Constructor with two arguments.");
	}
	ThisKeywordConstructor(int i, int j, int k){ 
		System.out.println("Constructor with three arguments.");
	}
	public static void main(String[] args) {
		ThisKeywordConstructor thisKeywordConstructor = new ThisKeywordConstructor(); // call non parameterized constructor
	} 
}
