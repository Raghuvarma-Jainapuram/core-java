package oops;

public class ThisKeywordConstructor2 {
int a ,b,c;
ThisKeywordConstructor2(){
	this(1,2,3); // call three parameterized constructor(Examples)
	System.out.println("My Default constructor:");
}
ThisKeywordConstructor2(int a,int b ,int c){
	//this(); // call non parameterized constructor(Examples) 
	this.a=a;
	this.b=b;
	this.c=c;
}

void msg() {
	System.out.println("Hii Hello");
}

public void displaydata() {
	this.msg(); //or  msg();     //rep a current method
	System.out.println("Value of a : "+a );
	System.out.println("Value of b : "+b );
	System.out.println("Value of c : "+c );
	
}

	public static void main(String[] args) {
		//Examples e = new Examples(1,2,4);
		//e.setdata(10, 10,20);
		ThisKeywordConstructor2 e = new ThisKeywordConstructor2();
		e.displaydata();
	}

}
