package com.java.designpatterns.creational.abstracts;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SMSNotification implements Notification {

    private static final Logger logger = Logger.getLogger(SMSNotification.class.getName());

    @Override
    public void NotifyUser() {
        logger.log(Level.INFO,"Sending an SMS Notification");
    }
}
