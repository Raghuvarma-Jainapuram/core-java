
import java.util.Scanner;

public class FibonacciSeriesUptoN {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        int a = 0;
        int b = 1;
        while (a <= num){
            System.out.print(a + " ");
            a = b - a;
            b = b + a;
        }
    }
}