package ControlFlow;
import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int counter = sc.nextInt();

//        while(counter>=1) {
//            System.out.println(counter);
//            counter--;
//        }

        //QUestion 8: Do the question 7 but using for-loop.

        for(int i = counter; i>=1; i--) {
            System.out.println(counter);
            counter--;
        }
        sc.close();
    }
}
