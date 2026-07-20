package ControlFlow;
import java.util.Scanner;

public class BMITracker {
    float height;
    float weight;

    public float calculateBMI(float height, float weight) {
        return weight/(height*height);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your height: ");
        float height = sc.nextFloat();

        System.out.println("Enter your weight: ");
        float weight = sc.nextFloat();

        BMITracker bmiTracker = new BMITracker();
        float bmi = bmiTracker.calculateBMI(height, weight);

        if(bmi<18.5) {
            System.out.println("Underweight");

        } else if (bmi>18.5 && bmi<24.9) {
            System.out.println("Normal");

        } else {
            System.out.println("Overweight");
        }

        sc.close();
    }
}

