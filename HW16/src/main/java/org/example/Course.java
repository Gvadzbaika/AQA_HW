package org.example;

import com.codeborne.selenide.SelenideElement;

class Course {

    private SelenideElement course;

    public Course (SelenideElement course){
        this.course = course.$("p.profession-bar_title");
    }

    public String getCourses() {
        return course.getText();
    }
}
