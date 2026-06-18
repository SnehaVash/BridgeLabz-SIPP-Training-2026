package programmingElements;
import java.util.*;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double height = sc.nextDouble();

        double areaCm2 = 0.5 * base * height;
        double areaInch2 = areaCm2 / 6.4516;

        System.out.println("Area of Triangle in square cm = " + areaCm2);
        System.out.println("Area of Triangle in square inches = " + areaInch2);

        sc.close();
    }
}
