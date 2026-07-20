package ControlFlow;
import java.util.*;

public class Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();

        System.out.println("Enter the third number:  ");
        int n3 = sc.nextInt();

        if(n1<n2 && n1<n3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
