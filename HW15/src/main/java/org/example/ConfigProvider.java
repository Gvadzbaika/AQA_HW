package org.example;

import java.io.IOException;
import java.util.Properties;

public class ConfigProvider {
    private static final Properties properties = getProperties();
    public static final String BASE_URL = properties.getProperty("base.testing.url");

    private static Properties getProperties()  {
        Properties properties = new Properties();
        try {
            properties.load(ClassLoader.getSystemResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static String getDriverName() {
        return properties.getProperty("driver");

    }
}

