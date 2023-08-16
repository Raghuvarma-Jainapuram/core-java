public class Employee{
 private int eid;
 private String ename;

 
Employee(){}
private Employee(int eid, String ename){
   this.eid=eid;
    this.ename=ename;
}
void display(int i) {
	System.out.println("int value "+i);
}
void display(byte i) {
	System.out.println("byte value "+i);
}
void display(float i) {
	System.out.println("float value "+i);
}
void display(double i) {
	System.out.println("double value "+i);
}
public static void main(String a[]){
   Employee eob = new Employee();
  Employee eob1 = new Employee(1111,"Swetha");
  
   System.out.println(eob.eid);  //0
   System.out.println(eob.ename); //null
    System.out.println(eob1.eid);  //1111
   System.out.println(eob1.ename); //Swetha
  
   eob.display(89);
   eob.display((byte)5);
   eob.display(6f);
   eob.display(6d);
   eob.display(34.5);
   eob.display(34.5f);
   int i=0;
   for(i=1;i<=10;i++) {
	   System.out.println(i);
   }
   System.out.println(i);
}
}