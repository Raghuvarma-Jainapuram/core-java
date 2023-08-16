package oops;
import basic.ProtectedEx;

// when Protected class and print method are public
//public class ProtectedAccessEx{
//	public static void main(String[] args) {
//		ProtectedEx p = new ProtectedEx();
//		p.print();
//	}
//}


// when Protected class is public but print method is protected
public class ProtectedAccessEx extends ProtectedEx {
	public static void main(String[] args) {
		ProtectedAccessEx p= new ProtectedAccessEx();
		p.print();
	}

}
