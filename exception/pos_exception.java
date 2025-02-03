package exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class pos_exception {
	public static void readFile(String fileName) throws PositiveException, FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
        	String line=sc.nextLine().trim();
        	int num = Integer.parseInt(line);
        	if(num>0) {
        		throw new PositiveException("Positive number found - " + num);
        	}
        	else
            System.out.println(num);
        }
        sc.close();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
			
            readFile("C:/Users/nandi/eclipse-workspace/first/src/main/java/exception/ex.txt"); 
        } 
     catch (PositiveException e) {
    System.out.println(e.getMessage());
     }
     catch(FileNotFoundException ex) {
	 System.out.println(ex);
       }
	}

}


	
