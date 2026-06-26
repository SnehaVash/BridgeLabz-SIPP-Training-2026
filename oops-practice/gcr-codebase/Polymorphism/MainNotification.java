package Polymorphism;

public class MainNotification {
    public static void main(String[] args) {
        Notification[] notifications = new Notification[3];

        notifications[0] = new EmailNotification(
                "Sneha", "Welcome to our platform!");
        notifications[1] = new SMSNotification(
                "Sneha", "Your OTP IS 123456.");
        notifications[2] = new PushNotification(
                "Sneha", "You have a new friend request.");

        System.out.println("All sent Notifications: ");

        for (Notification n : notifications) {
            n.sendNotification();
        }
    }
}
