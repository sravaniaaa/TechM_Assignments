package filess;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class bytearray {
	public static byte[] readFileToByteArray(String filePath) {
        File file = new File(filePath);
        byte[] byteArray = null;

        if (!file.exists()) {
            System.out.println("The specified file does not exist.");
            return null;
        }

        try (FileInputStream fis = new FileInputStream(file)) {
            byteArray = new byte[(int) file.length()];  
            fis.read(byteArray);
            System.out.println("File content successfully read into byte array.");
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        return byteArray;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "C:/Users/nandi/eclipse-workspace/first/src/main/java/exception/ex.txt";
		byte[] fileData = readFileToByteArray(filePath);
		if (fileData != null) {
            System.out.println("Byte array size: " + fileData.length);
            System.out.println(new String(fileData));
		}
		}

}
