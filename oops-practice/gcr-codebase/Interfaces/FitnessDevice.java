package Interfaces;

public class FitnessDevice implements Trackable, Reportable, Notifiable {

    @Override
    public void logActivity() {
        System.out.println("Activity Logged: 5000 steps completed.");
    }

    @Override
    public void generateReport() {
        System.out.println("Fitness Report Generated.");
    }

    @Override
    public void sendAlert() {
        System.out.println("Alert: Time to drink water!");
    }
}