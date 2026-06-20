package ControlFlow;
import java.util.Scanner;

public class ThreeFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Amar's Age: ");
        int amarAge = sc.nextInt();

        System.out.println("Enter Akbar's Age: ");
        int akbarAge = sc.nextInt();

        System.out.println("Enter Anthony's Age: ");
        int anthonyAge = sc.nextInt();

        System.out.println("Enter Amar's Height: ");
        Double amarHeight = sc.nextDouble();

        System.out.println("Enter Akbar's Height: ");
        Double akbarHeight = sc.nextDouble();

        System.out.println("Enter Anthony's Height: ");
        Double anthonyHeight = sc.nextDouble();

        String youngest;
        if(amarAge <= akbarAge && amarAge <= anthonyAge) {
            youngest = "Amar";
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        String tallest;
        if(amarHeight <= akbarHeight && amarHeight <= anthonyHeight) {
            tallest = "Amar";
        } else if (akbarHeight <= amarHeight && akbarHeight <= anthonyHeight) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        System.out.println("Youngest: "+youngest);
        System.out.println("Tallest: "+tallest);

        sc.close();
    }
}
