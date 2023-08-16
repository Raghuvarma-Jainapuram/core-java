import java.util.Scanner;

class Rectangle{
	int width;
	int height;
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	int get_width(){
		return this.width;
	}
	void print_area(){
		System.out.println("Area of a Rectangle is : " + this.width * this.height);
	}
}
public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		Rectangle rect = new Rectangle(w, h);

		System.out.println("Width " + rect.get_width());
		System.out.println("Height " + rect.height);
		rect.print_area();
		sc.close();
	}
}