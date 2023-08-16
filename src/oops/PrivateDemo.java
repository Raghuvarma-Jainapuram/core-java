package oops;

class Demo{
	int a;
	private int c=3;
	void display() {
//		int b=43;
		System.out.println(a);
		System.out.println(c);
	}
}
public class PrivateDemo {
	
	private int a=2;
	public void test() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.a=10;
		d.display();
//		System.out.println(d.c);
		PrivateDemo p = new PrivateDemo();
		System.out.println(p.a);
		p.a=10;
		p.test();
	}
}
