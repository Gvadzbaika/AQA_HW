package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class Category {
    private WebDriver driver;

    @FindBy(css = "a.categories_link.btn")
    private WebElement categoryName;

    public Category(WebDriver driver, WebElement block) {
        this.driver = driver;
        PageFactory.initElements(new DefaultElementLocatorFactory(block), this);
    }

    public String getCategoryName() {
        return categoryName.getText();
    }
}
