package fileHandling;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;

public class CustomerFeedback {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int count = 0;
            System.out.println("Enter 5 Feedback: ");

            for(int i = 1; i<=5; i++) {
                System.out.println("Feedback " +i+ ":");
                String feedback = reader.readLine();

                if(feedback.toLowerCase().contains("good")) {
                    count++;
                }
            }
            System.out.println("Count of good in feedbacks are: " +count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
