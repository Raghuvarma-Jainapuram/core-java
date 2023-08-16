package file;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile_AbsolutePath {
	public static void main(String[] args) throws Exception {
		File newFile = new File("D:/Edubridge/Java Programming/basic/ListOfCourses1.txt");
		if(newFile.createNewFile()){
			System.out.println("File created");
		}
		else {
			System.out.println("File exists");
		}
		// Absolute and Canonical both are same
		System.out.println("Absolute path: " + newFile.getAbsolutePath());
		System.out.println("Canonical path: " + newFile.getCanonicalPath());
		
		System.out.println("Can read: " + newFile.canRead());
		System.out.println("Can write: " + newFile.canWrite());
		System.out.println("File name: " + newFile.getName());
		System.out.println("Size of a file: " + newFile.length()+"\n");
		// Inserting files from exceptions to array
		File newFile1 = new File("D:/EduBridge/Java Programming/basic/src/exceptions");
		String[] list = newFile1.list();
		// printing list of files from array
		System.out.println("List of files("+list.length+"): ");
		for(int i=0; i<list.length; i++) {
			System.out.println((i+1) + "." + list[i]);
		}
		System.out.println();
		
		Path absolutePath1 = Paths.get("D:/EduBridge/Java Programming/basic/ListOfCourses1.txt/");
		Path absolutePath2 = Paths.get("D:/EduBridge/Java Programming/basic");  // ListOfCourses1.txt
		Path absolutePath3 = Paths.get("D:/EduBridge");  // Java Programming\basic\ListOfCourses1.txt
	    Path absolutePath4 = Paths.get("D:/EduBridge/Java Programming/basics"); // ..\basic\ListOfCourses1.txt

	    // convert the absolute path to relative path
	    Path relativePath = absolutePath2.relativize(absolutePath1);
	    System.out.println("Relative Path: " + relativePath);
	}
}
