package org.example;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    private SelenideElement testingProgramCourse = $x("//*[@id=\"body\"]/div/main/section[2]/div/div/div[1]/div/ul/li[2]/a/div/p[1]");

    public void clickOnProgramCourse() {
        testingProgramCourse.click();
    }
}
