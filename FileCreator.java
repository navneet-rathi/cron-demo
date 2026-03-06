import java.io.File;
import java.io.IOException;

public class FileCreator {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            try {
                File file = new File("file" + i + ".txt");
                if (file.createNewFile()) {
                    System.out.println("Created: " + file.getName());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
