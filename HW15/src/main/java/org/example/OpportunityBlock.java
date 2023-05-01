package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class OpportunityBlock {
    private WebDriver driver;

    @FindBy(css = "p.opportunity-item_title.p-l")
    private WebElement opportunityTitle;

    public OpportunityBlock(WebDriver driver, WebElement block) {
        this.driver = driver;
        PageFactory.initElements(new DefaultElementLocatorFactory(block), this);
    }

    public String getOpportunityTitle() {
        return opportunityTitle.getText();
    }

}
