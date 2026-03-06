import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class RandomStringExecutor {
    public static void main(String[] args) {
        try {
            System.out.println("Sleeping for 2 seconds...");
            // Take a sleep for 2000 milliseconds (2 seconds)
            Thread.sleep(2000); 
            
            System.out.println("Executing random strings:");
            // Execute random string for 10 times
            for (int i = 0; i < 10; i++) {
                String randomString = UUID.randomUUID().toString().substring(0, 8);
                System.out.println("String " + (i + 1) + ": " + randomString);
                // Optional: add a small delay between strings
                // Thread.sleep(500); 
            }
        } catch (InterruptedException e) {
            System.err.println("Thread was interrupted");
        }
    }
}