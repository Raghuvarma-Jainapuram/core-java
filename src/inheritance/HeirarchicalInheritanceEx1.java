package inheritance;

class Vehicle{
	String v = "Vehicle";
}
class Car extends Vehicle{
	String carName = "Honda i20";
	String color = "Red";
	int seaters = 5;
	int milage = 26;
	void displayCar() {
		System.out.println(v+": Car");
		System.out.println("Name: "+carName);
		System.out.println("Color: "+color);
		System.out.println("Seaters: "+seaters);
		System.out.println("Milage: "+milage+" kmpl");
	}
}
class Bike extends Vehicle{
	String bikeName = "Royal Enfield";
	String color = "Black";
	int milage = 70;
	void displayBike() {
		System.out.println(v+": Bike");
		System.out.println("Name: "+bikeName);
		System.out.println("Color: "+color);
		System.out.println("Milage: "+milage+" kmpl");
	}
}
class Truck extends Vehicle{
	String truckName = "Mahindra Blazo X 28 Tipper";
	int payload = 20000;
	int milage = 5;
	int engine = 7200;
	void displayTruck() {
		System.out.println(v+": Truck");
		System.out.println("Name: "+truckName);
		System.out.println("payload: "+payload+" kgs");
		System.out.println("Engine: "+engine + " cc");
		System.out.println("Milage: "+milage + " kmpl");
	}
}

public class HeirarchicalInheritanceEx1 {

	public static void main(String[] args) {
		Car c = new Car();
		Bike b = new Bike();
		Truck t = new Truck();
		c.displayCar();
		System.out.println();
		b.displayBike();
		System.out.println();
		t.displayTruck();

	}

}
