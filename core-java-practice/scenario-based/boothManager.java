package scenarioBased;
import java.util.Scanner;

public class boothManager {
    int age;

    int candidate1 = 0;
    int candidate2 = 0;
    int candidate3 = 0;

    public void eligibleOrNot(int age) {
        if(age>=18) {
            System.out.println("Yes");

            System.out.println("1. Candidate 1");
            System.out.println("2. Candidate 2");
            System.out.println("3. Candidate 3");

        } else {
            System.out.println("No");
        }
    }

    public void recordVote(int vote) {
        if(vote == 1) {
            candidate1++;
        } else if(vote == 2) {
            candidate2++;
        } else if(vote == 3) {
            candidate3++;
        } else {
            System.out.println("Invalid Candidate");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boothManager eligible = new boothManager();

        while(true) {
            System.out.println("Enter Your Age: ");
            int age = sc.nextInt();

            if(age == -1) {
                break;
            }

            eligible.eligibleOrNot(age);

            if(age>=18) {
                System.out.println("Enter Your Vote: ");
                int vote = sc.nextInt();

                eligible.recordVote(vote);
            }
        }

        System.out.println("Votes of Candidate 1: " + eligible.candidate1);
        System.out.println("Votes of Candidate 2: " + eligible.candidate2);
        System.out.println("Votes of Candidate 3: " + eligible.candidate3);

        sc.close();
    }
}
