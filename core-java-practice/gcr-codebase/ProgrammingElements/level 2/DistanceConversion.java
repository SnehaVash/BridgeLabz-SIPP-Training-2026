package programmingElements;
import java.util.*;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double feet = sc.nextDouble();

        double yards = feet / 3;
        double miles = feet / 5280;

        System.out.println("Distance in yards = " + yards);
        System.out.println("Distance in miles = " + miles);

        sc.close();
    }
}
