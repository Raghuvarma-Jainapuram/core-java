package patterns;
import java.util.Scanner;


public class ImAmsterdam {
	public int CountAm(String str){
		int count = 0;
		String loweStr = str.toLowerCase();
		String[] strArray = loweStr.split(" ");
		for(int i=0; i<strArray.length; i++) {
				if(strArray[i].equals("am")) {
					count +=1;
				}
			}
		return count;
		}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//System.out.print("Enter a String here : ");
		String str = s.nextLine();
		ImAmsterdam c=new ImAmsterdam();
		System.out.println(c.CountAm(str));
		//System.out.println("Count of am :" +c.CountAm(str));
		
		s.close();
	}
}
