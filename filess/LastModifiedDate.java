package filess;
import java.io.File;
import java.text.SimpleDateFormat;

public class LastModifiedDate {
    public static void getLastModifiedDate(String filePath) {
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("The specified file does not exist.");
            return;
        }

        long lastModified = file.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = sdf.format(lastModified);

        System.out.println("Last modified date of the file: " + formattedDate);
    }

    public static void main(String[] args) {
        String filePath = "C:/Users/nandi/eclipse-workspace/first/src/main/java/exception/ex.txt";

        getLastModifiedDate(filePath);
    }
}