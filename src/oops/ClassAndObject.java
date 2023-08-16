package oops;

public class ClassAndObject {
		class add{ 
		 int a,b,c; 
		} 
		   void sum(){ 
		  int a=10; 
		  int b=15; 
		  int c=5; 
		  int d=(a+b+c); 
		  System.out.println(+d); 
		 } 
		void sub() { 
		 int x=10; 
		 int y=15; 
		 int z=x-y; 
		 System.out.println(+z); 
		} 
		void mul() { 
		 int a1=2; 
		 int b1=5; 
		 int c1=15; 
		 int d1=(a1*b1*c1); 
		 System.out.println(+d1); 
		} 
		 
		 
		 public static void main(String[] args) { 
			 ClassAndObject obj=new ClassAndObject(); 
		  
		 obj.sum(); 
		 obj.sub(); 
		 obj.mul(); 
		   
		 
		 } 
}
