package dev.mohammad.mirzakhani;

import java.util.UUID;

public class Notification {

    private String id;
    private String message;

    public Notification(String message) {

        id = UUID.randomUUID().toString();
        this.message = message;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
