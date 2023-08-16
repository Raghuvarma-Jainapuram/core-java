package mySqlEx;

public class PersonEntity {
	private int id;
	private String name;
	int age;
	String gender;
	String city;
	String degree;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "PersonEntity [id=" + id + ", name=" + name + "]";
	}
	public PersonEntity(int id, String name, int age, String gender, String city, String degree) {
//		super();
		this.id=id;
		this.name=name;
	}

}
