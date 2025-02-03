package filess;
import java.io.File;
import java.io.FilenameFilter;
public class specificfiles {
	public static void listFilesWithExtension(String directoryPath, String extension) {
        File directory = new File(directoryPath);

        if (!directory.exists()) {
            System.out.println("Directory does not exist.");
            return;
        }

        if (!directory.isDirectory()) {
            System.out.println("given path is not a directory.");
            return;
        }

        
        FilenameFilter filter = (dir, name) -> name.toLowerCase().endsWith(extension.toLowerCase());

        File[] files = directory.listFiles(filter);

        if (files == null || files.length == 0) {
            System.out.println("No files found with extension: " + extension);
            return;
        }

        System.out.println("Files with extension '" + extension + "' in directory: " + directoryPath);
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
	public static void main(String[] args) {
		 String directoryPath = "C:/Users/nandi/eclipse-workspace/first/src/main/java/exception";  
	        String extension = ".txt"; 

	        listFilesWithExtension(directoryPath, extension);
	}

}
