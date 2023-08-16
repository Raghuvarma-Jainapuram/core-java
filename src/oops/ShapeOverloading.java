package oops;

public class ShapeOverloading {
	public static double calculateArea(double radius) {
		return Math.PI * (radius*radius);
	}
	public static double calculateArea(double length, double width) {
		return length*width;
	}
	public static double calculateArea(int height, double width) {
		return (height*width)/2;
	}
	public static void main(String[] args) {
		double radius = 5.0;
		double length = 10.0;
		double width = 7.0;
		int height = 4;
		
		double circleArea = calculateArea(radius);
		double rectangleArea = calculateArea(length, width);
		double triangleArea = calculateArea(height, width);
		
		System.out.println("Area of Circle : " + circleArea);
		System.out.println("Area of rectangle : " + rectangleArea);
		System.out.println("Area of triangle : " + triangleArea);
	}
}
