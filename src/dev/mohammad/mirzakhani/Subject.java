package dev.mohammad.mirzakhani;

public interface Subject {

    void addSubscriber(Observer observer);
    void setNewNotification(Notification newNotification);
    void notifyAllObservers();
}
