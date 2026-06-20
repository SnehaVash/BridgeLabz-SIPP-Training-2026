package ControlFlow;
import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = sc.nextInt();

//        if (number > 0) {
//            for (int i = 1; i < number; i++) {
//                if (number % i == 0) {
//                    System.out.println(i);
//                }
//            }
//        } else {
//            System.out.println("Please enter a positive integer.");
//        }

        //Next Question: Same question but with while loop.
        if (number > 0) {
            int i = 1;
            while(i<=number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }


        sc.close();
    }
}
