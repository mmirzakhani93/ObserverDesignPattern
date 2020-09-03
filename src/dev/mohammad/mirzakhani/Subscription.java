package dev.mohammad.mirzakhani;

import java.util.ArrayList;
import java.util.List;

public class Subscription implements Subject{

    private List<Observer> subscribers = new ArrayList<>();
    private Notification notification;

    @Override
    public void addSubscriber(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void setNewNotification(Notification newNotification) {

        this.notification = newNotification;
        notifyAllObservers();
    }

    @Override
    public void notifyAllObservers() {

        for (Observer subscriber : subscribers) {
            subscriber.sendNotification(notification);
        }
    }
}
