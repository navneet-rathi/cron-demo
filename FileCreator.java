import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCreator {
        public static void main(String[] args) {
        String logDirectory = "/var/log/mybackendapp/"; // Must have write permissions
        int numberOfFiles = 100;

        // Ensure the directory exists
        File dir = new File(logDirectory);
        if (!dir.exists()) {
            dir.mkdirs(); // Creates parent directories if they don't exist
        }

        for (int i = 1; i <= numberOfFiles; i++) {
            String fileName = "backend_log_" + i + ".log";
            File logFile = new File(logDirectory + fileName);

            try (PrintWriter writer = new PrintWriter(new FileWriter(logFile))) {
                writer.println("This is log message " + i + " for backend execution.");
                System.out.println("Created file: " + logFile.getAbsolutePath());
            } catch (IOException e) {
                System.err.println("Error writing to file " + fileName + ": " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}