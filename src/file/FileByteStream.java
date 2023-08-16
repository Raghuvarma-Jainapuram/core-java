package file;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileByteStream {

//	public static void main(String[] args) throws Exception{
	public static void main(String[] args){
// File Output Stream
		try {
		FileOutputStream  fos = new FileOutputStream("D:/FileOutputStream.txt");
		String s = "Hello.. Everyone! \nThis is full stack java course.";
		byte[] arr = s.getBytes();
        // fos.write(65);
		fos.write(arr);
		System.out.println("Content Written Successfully.");
// File Input Streak
		FileInputStream fis = new FileInputStream("D:/FileOutputStream.txt");
		System.out.println("File content is: ");
		int i = fis.read();
		while(i != -1) {
			//System.out.print(i);
			System.out.print((char)i);
			i=fis.read();
		}
		System.out.println();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally {
			System.out.println("\nYou reached end of the file");
		}
//		fis.close();
//		fos.close();

	}

}
