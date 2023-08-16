package basic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferReaderEx {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter bill amount: ");
		String str = br.readLine();
		double bill = Double.parseDouble(str);
		double tip = (bill*15) / 100;
		System.out.println("Tip amount: "+tip);
	}
}
