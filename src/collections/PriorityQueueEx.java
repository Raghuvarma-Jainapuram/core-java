package collections;
import java.util.PriorityQueue;

class Student2 implements Comparable<Student2>{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Student2(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student2 [age=" + age + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student2 o) {
		if(this.getAge()>o.getAge()) {
			return 1;
		}else if(this.getAge()<o.getAge()) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
	
	
	}
public class PriorityQueueEx {

	public static void main(String[] args) {

	PriorityQueue<Student2> st=new PriorityQueue();
	st.add(new Student2(34, "Niveditha"));
	st.add(new Student2(78, "Naveen"));
	st.add(new Student2(56, "sacheth"));
	st.add(new Student2(25, "sachin"));
	st.add(new Student2(12, "karthick"));
	
	while(!st.isEmpty()) {
		System.out.println(st.remove());
	}
	}

}

