package com.java.designpatterns.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        NotificationCollection notificationCollection = new NotificationCollection();
        NotificationBar notificationBar = new NotificationBar(notificationCollection);
        notificationBar.printNotifications();;
    }
}
