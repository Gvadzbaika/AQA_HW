package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class NameList {
    @FindBy(css = ".coach-card")
    private List<WebElement> couchCards;

    @FindBy(css = ".coach-card_name")
    private WebElement couchCardName;

    public String getName() {
        return couchCardName.getText();
    }
    public static List<NameList> getCouchesCards(WebDriver driver) {
        List<NameList> couchesCardsList = new ArrayList<>();
        List<WebElement> couchesCards = driver.findElements(By.cssSelector("div.coach-card_content"));
        for (WebElement card : couchesCards) {
            couchesCardsList.add(PageFactory.initElements(card, NameList.class));
        }
        return couchesCardsList;
    }
    public static List<String> getCouchesNames(List<NameList> couchesCardsList) {
        List<String> names = new ArrayList<>();
        for (NameList couchesCard : couchesCardsList) {
            names.add(couchesCard.getName());
        }
        return names;
    }
}
