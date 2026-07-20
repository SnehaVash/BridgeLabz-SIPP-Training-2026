package ControlFlow;
import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        System.out.print("Enter a value: ");
        double value = sc.nextDouble();

//        while(value!=0) {
//            total += value;
//            value = sc.nextDouble();
//        }

        //Question 11: Question 10 but stop when input is zero or a negative number.
        while(value<=0){
            total += value;
            value = sc.nextDouble();
        }
        System.out.println(total);
        sc.close();
    }
}
