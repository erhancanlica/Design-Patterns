package creational.patterns.abstracts;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PushNotification implements Notification{

    private static final Logger logger = Logger.getLogger(PushNotification.class.getName());

    @Override
    public void NotifyUser() {
        logger.log(Level.INFO, "Send an Push Notification");
    }
}
