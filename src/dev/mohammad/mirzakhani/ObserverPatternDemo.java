package dev.mohammad.mirzakhani;

import java.util.Date;

public class ObserverPatternDemo {

    public static void main(String[] args) {

        Subscription subscription = new Subscription();
        Subscriber s1 = new Subscriber(subscription);
        Subscriber s2 = new Subscriber(subscription);
        Subscriber s3 = new Subscriber(subscription);

        subscription.setNewNotification(new Notification(new Date().toString()));

    }
}
