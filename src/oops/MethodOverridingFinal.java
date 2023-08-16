package oops;
// Method overriding technique ---> runtime polymorphism

// TODO Auto-generated method stub
class Learner{
	public void lname() {
		System.out.println("My name is Raghuvarma");
	}

//	final void courseName()
	void courseName()
	{
		System.out.println("Java full Stack");
	}
}
class Lcourse extends Learner{
//	void courseName() // --> Cannot override the final method from Learner. 
	void courseName()
	{
		super.courseName();
		System.out.println("data analytics");
	}
}
public class MethodOverridingFinal {

	public static void main(String[] args) {
		Lcourse l=new Lcourse();
		l.courseName();
		l.lname();
		//Learner le=new Learner();
		//le.courseName();
		//le.lname();
	}

}
