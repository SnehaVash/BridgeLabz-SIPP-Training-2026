package Polymorphism;

public abstract class Notification {
    protected String recipientName;
    protected String message;

    public Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    public abstract void sendNotification();
}
