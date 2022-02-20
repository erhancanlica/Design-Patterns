package com.java.designpatterns.behavioral.iterator;

public class NotificationCollection implements Collection{

    static final int MAX_ITEMS = 6;
    int numberOfList = 0;
    Notification[] notificationList;

    public NotificationCollection() {
        notificationList = new Notification[MAX_ITEMS];

        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    private void addItem(String s) {
        Notification notification = new Notification(s);
        if (numberOfList >= MAX_ITEMS) {
            System.err.println("Full");
        } else {
            notificationList[numberOfList++] = notification;
        }
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }
}
