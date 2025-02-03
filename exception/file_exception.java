package exception;
import java.util.*;
import java.io.*;
public class file_exception {
	public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
            readFile("C:/Users/nandi/eclipse-workspace/first/src/main/java/exception/ex.txt"); 
        } catch (FileNotFoundException e) {
            System.out.println("Error:File not found  " + e.getMessage());
        }
	}

}

    

   