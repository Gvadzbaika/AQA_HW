package org.example;

import com.codeborne.selenide.SelenideElement;

public class AdditionalCourse {

    private SelenideElement additionalCourse;

    public AdditionalCourse(SelenideElement additionalCourse){
        this.additionalCourse = additionalCourse.$("p.profession-bar_title");
    }

    public String getCourses() {
        return additionalCourse.getText();
    }
}
