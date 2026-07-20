package ControlFlow;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();

        System.out.println("Enter the third number: ");
        int n3 = sc.nextInt();

        if(n1>n2 && n1>n3) {
            System.out.println("First is the largest of three");
        } else if (n2>n1 && n2>n3) {
            System.out.println("Second is the largest of the three");
        } else {
            System.out.println("Third is the largest of the three");
        }

        sc.close();
    }
}
