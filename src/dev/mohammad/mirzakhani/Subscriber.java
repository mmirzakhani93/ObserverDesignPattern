package dev.mohammad.mirzakhani;

public class Subscriber implements Observer{

    public Subscriber(Subject subscription) {
        subscription.addSubscriber(this);
        System.out.println("New Subscriber added...");
    }

    @Override
    public void sendNotification(Notification notification) {
        System.out.println(notification.toString());
    }
}
