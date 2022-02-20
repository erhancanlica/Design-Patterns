package com.java.designpatterns.creational.abstracts;

public class NotificationService {

    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.getNotification("Mai22l");
        notification.NotifyUser();
    }

}
