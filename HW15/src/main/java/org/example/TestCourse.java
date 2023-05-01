package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class TestCourse {
    private WebDriver driver;

    @FindBy(css = "p.profession-bar_title")
    private WebElement testCourse;

    public TestCourse(WebDriver driver, WebElement block) {
        this.driver = driver;
        PageFactory.initElements(new DefaultElementLocatorFactory(block), this);
    }

    public String getCourses() {
        return testCourse.getText();
    }
}
