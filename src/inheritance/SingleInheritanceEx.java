package inheritance;
class Vehicle_v{
	void displayVehicle() {
		System.out.println("Parent class - Vehcle");
	}
}
class Bike_b extends Vehicle_v{
	void displayBike() {
		System.out.println("Child class - Bike");
	}
}

public class SingleInheritanceEx {

	public static void main(String[] args) {
		Bike_b b=new Bike_b();
		b.displayBike();
		b.displayVehicle();

	}

}
