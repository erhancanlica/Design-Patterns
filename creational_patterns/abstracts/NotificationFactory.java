package creational.patterns.abstracts;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NotificationFactory {

    private static final Logger logger = Logger.getLogger(NotificationFactory.class.getName());

    public Notification getNotification(String type) {
        switch (type) {
            case "Sms":
                return new SMSNotification();
            case "Mail":
                return new MailNotification();
            case "Push":
                return new PushNotification();
            default:
                logger.log(Level.INFO, "please enter a valid value");
                break;
        }
        return null;
    }
}
