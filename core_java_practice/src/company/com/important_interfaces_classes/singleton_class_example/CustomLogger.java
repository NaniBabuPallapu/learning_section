package company.com.important_interfaces_classes.singleton_class_example;

import java.util.logging.Logger;

public class CustomLogger {
    private static CustomLogger instance;
    private Logger logger;

    private CustomLogger() {
        initializeLogger();
    }

    public static synchronized CustomLogger getInstance() {
        if (instance == null) {
            instance = new CustomLogger();
        }
        return instance;
    }

    private void initializeLogger() {
        logger = Logger.getLogger(CustomLogger.class.getName());
    }

    public void printLog(String message) {
        logger.info(message);
    }
}
