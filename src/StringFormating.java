import java.util.Scanner;

public class StringFormating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        // using format method
        String result = "%s is %d years old.";
        System.out.println(String.format(result, name, age));
        // using printf method 
        System.out.printf("%s is %d years old.", name, age);
        sc.close();
    }
}