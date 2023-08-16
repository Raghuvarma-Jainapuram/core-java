package java8;

class Student2 implements Cloneable{  
	int rollno;  
	String name;  
	//class constructor
	Student2(int rollno,String name){  
		this.rollno=rollno;  
		this.name=name;  
	}  

	//clone method 
	public Object clone()throws CloneNotSupportedException{     
		return super.clone();  
	}  
}
public class MarkerInterfaceCloable {

	public static void main(String[] args) throws CloneNotSupportedException {
		//try{  
		Student2 s1=new Student2(1,"Mayaa");  
		//clone the s1 object
		Student2 s2=(Student2)s1.clone();  

		System.out.println("Original Student object: " + s1.rollno+" "+s1.name);  
		System.out.println("Cloned Student object: " + s2.rollno+" "+s2.name);  

		// }catch(CloneNotSupportedException c){} 

	}

}
