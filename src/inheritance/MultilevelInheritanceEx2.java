package inheritance;

class Laptop{
	String laptop = "Laptop";
	void displayLaptop() {
		System.out.println(laptop);
	}
	
}
class Brand extends Laptop{
	String brand="HP";
	void displayBrand() {
		System.out.println(brand);
	}
	
}
class ModelAndFeatures extends Brand{
	String model = "15s";
	String Processor = "Intel(R) Core i3";
	int ram = 8;
	int rom = 512;
	void displayDetails() {
		System.out.println(model);
		System.out.println(Processor);
		System.out.println(ram + " RAM");
		System.out.println(rom + " SSD");
	}
}
public class MultilevelInheritanceEx2 {

	public static void main(String[] args) {
		ModelAndFeatures m=new ModelAndFeatures();
		m.displayLaptop();
		m.displayBrand();
		m.displayDetails();

	}

}
