package exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class emptyfile {
    public static void readFile(String fileName) throws FileNotFoundException, EmptyFileException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        if (!scanner.hasNextLine()) {  
            scanner.close();
            throw new EmptyFileException("Error: The file is empty!");
        }

        System.out.println("File content:");
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void main(String[] args) {
        try {
            readFile("C:/Users/nandi/eclipse-workspace/first/src/main/java/exception/ex2.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (EmptyFileException e) {
            System.out.println(e.getMessage());
        }
    }
}

