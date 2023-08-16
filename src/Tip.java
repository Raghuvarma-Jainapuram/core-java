import java.util.Scanner;
public class Tip {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		double bill=Double.parseDouble(str);
		double tip = (bill*15) / 100;
		System.out.println(tip);
	}

}
