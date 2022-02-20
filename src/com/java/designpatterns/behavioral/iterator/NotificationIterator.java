package com.java.designpatterns.behavioral.iterator;

public class NotificationIterator implements Iterator {
    Notification[] notificationList;

    int next = 0;

    public NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public boolean hasNext() {
        return !(next >= notificationList.length || notificationList[next] == null);
    }

    @Override
    public Object next() {
        return notificationList[next++];
    }
}
