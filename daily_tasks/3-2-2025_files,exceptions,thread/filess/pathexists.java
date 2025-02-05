package filess;
import java.io.File;
public class pathexists {
	public static void checkPathExists(String path) {
        File file = new File(path);

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("The path exists and it is a file.");
            } else if (file.isDirectory()) {
                System.out.println("The path exists and it is a directory.");
            }
        } else {
            System.out.println("The specified path does not exist.");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String path="C:/Users/nandi/eclipse-workspace/first/src/main/java/exception";
	   checkPathExists(path);
	}

}
