package ControlFlow;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Physics marks: ");
        double phy = sc.nextDouble();

        System.out.println("Enter Chemistry marks: ");
        double che = sc.nextDouble();

        System.out.println("Enter Maths marks: ");
        double maths = sc.nextDouble();

        double avg = (phy + che + maths) / 3.0;

        String grade;
        String remarks;

        if(avg>=80) {
            grade = "A";
            remarks = "Level 4";
        } else if(avg >= 70) {
            grade = "B";
            remarks = "Level 3";
        } else if(avg >= 60) {
            grade = "C";
            remarks = "Level 2";
        } else if(avg >= 50) {
            grade = "D";
            remarks = "Level 1";
        } else if(avg >= 40) {
            grade = "E";
            remarks = "Level -1";
        } else {
            grade = "R";
            remarks = "Remedial Standards";
        }

        System.out.println("Average marks: " +avg);
        System.out.println("Grade: " +grade);
        System.out.println("Remarks: " +remarks);

        sc.close();
    }
}
