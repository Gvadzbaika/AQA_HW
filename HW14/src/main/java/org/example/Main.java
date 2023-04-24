package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://ithillel.ua/");
        HillelPage hillelPage = PageFactory.initElements(driver, HillelPage.class);
        hillelPage.clickOnProgramCourse();
        hillelPage.clickOnFrontEndCourse();
        hillelPage.clickShowAll(driver);
        List<NameList> couchesCards = NameList.getCouchesCards(driver);
        List<String> couchesNames = NameList.getCouchesNames(couchesCards);
        System.out.println(couchesNames);
    }
}