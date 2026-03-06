import java.util.concurrent.TimeUnit;
import java.util.Random;

public class RandomStringExecutor {
 public static void main(String[] args) {
        String[] thoughts = {
            "Believe you can and you're halfway there.",
            "Act as if what you do makes a difference.",
            "Success is not final, failure is not fatal.",
            "The only way to do great work is to love what you do.",
            "Never limit yourself because of others' limited imagination.",
            "The best time to plant a tree was 20 years ago.",
            "Keep looking up – that's the secret of life.",
            "The only limit to our realization of tomorrow is our doubts.",
            "Do what you can, with what you have, where you are.",
            "It always seems impossible until it's done."
        };

        Random random = new Random();
        int repetitions = 10;
        long sleepTimeMs = 2000; // 2 seconds

        System.out.println("--- Starting Thought of the Day Generator ---");

        for (int i = 1; i <= repetitions; i++) {
            try {
                // Select and print a random phrase
                String phrase = thoughts[random.nextInt(thoughts.length)];
                System.out.println(i + ". Thought: " + phrase);

                // Take a sleep (2 seconds)
                Thread.sleep(sleepTimeMs);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("--- Finished ---");
    }
}