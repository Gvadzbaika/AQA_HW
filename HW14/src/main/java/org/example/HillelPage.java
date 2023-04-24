package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HillelPage {
    @FindBy(xpath = "//*[@id=\"body\"]/div[1]/main/section[2]/div/div/div[1]/div/ul/li[1]/a/div")
    private WebElement programingCourse;
    @FindBy(xpath = "//*[@id=\"categories\"]/div[3]/div/ul/li[1]/div/div[1]/ul/li[1]/a/div[2]")
    private WebElement frontEndCourse;
    @FindBy(id = "coachesShowAllButton")
    private WebElement showAllBtn;

    public void clickOnProgramCourse() {
        programingCourse.click();
    }
    public void clickOnFrontEndCourse() {
        frontEndCourse.click();
    }
    public void clickShowAll(WebDriver driver) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");
        Thread.sleep(5000);
        showAllBtn.click();
    }
  }
