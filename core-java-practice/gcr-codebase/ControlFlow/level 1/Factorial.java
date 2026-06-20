package ControlFlow;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int n = sc.nextInt();

        int fact = 1;
//        int i = 1;

//        while(i<=n) {
//            fact *= i;
//            i++;
//        }
        //Question next: Doing the same using the for loop;
        for(int i = 1; i<=n; i++) {
            fact *= i;
        }
        System.out.println(fact);
        sc.close();
    }
}
