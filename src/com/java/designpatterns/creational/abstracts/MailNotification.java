package com.java.designpatterns.creational.abstracts;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MailNotification implements Notification{

    private static final Logger logger = Logger.getLogger(MailNotification.class.getName());

    @Override
    public void NotifyUser() {
        logger.log(Level.INFO, "Send an Mail Notification");
    }
}
