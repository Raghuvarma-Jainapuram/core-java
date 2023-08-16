package oops;


class Learner_l{
	public void lname(String name) {
		System.out.println("My name is "+name);
	}

	void courseName()
	{
		System.out.println("Java full Stack");
	}

	void courseDuration(int a){
		System.out.println(a+" months");
	}
}
class Lcourse_c extends Learner_l{
	protected void courseName()   //Cannot reduce the visibility of inherited method in child class
	{
		super.courseName();
		System.out.println("data analytics");
	}
	@Override
	void courseDuration(int a){
		System.out.println(a+" months");
	}

	void analytics() {
		System.out.println("Analytics");
	}

}

public class MethodOverridingEx1 {

	public static void main(String[] args) {
		Learner_l l=new Lcourse_c(); //Learner_l l=new Lcourse();
		l.courseName();
		l.lname("Raghu");
		l.courseName();
		l.courseDuration(4);
		//Learner le=new Learner();
		//le.courseName();
		//le.lname();
	}

}
