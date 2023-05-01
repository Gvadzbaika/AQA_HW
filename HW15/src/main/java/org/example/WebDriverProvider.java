package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class WebDriverProvider {

    public static WebDriver getDriver() {
        String driverName = ConfigProvider.getDriverName();

        return switch (driverName) {
            case "chrome" -> WebDriverManager.chromiumdriver().create();
            case "firefox" -> WebDriverManager.firefoxdriver().create();
            case "edge" -> WebDriverManager.edgedriver().create();
            default -> throw new IllegalArgumentException("Wrong browser type");
        };
    }


}
