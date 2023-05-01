package org.example;


import org.openqa.selenium.WebDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = WebDriverProvider.getDriver();
        driver.get(ConfigProvider.BASE_URL);

        TestingPage testingPage = new TestingPage(driver);

        List<TestCourse> testCourses = testingPage.getCoursesBlock();
        List<String> courses = testingPage.getCourses(testCourses);
        System.out.println(courses);

        List<AdditionalCourse> additionalCourses = testingPage.getAdditionalCoursesBlock();
        List<String> additionalCoursesNames = testingPage.getAdditionalCourses(additionalCourses);
        System.out.println(additionalCoursesNames);

        List<OpportunityBlock> opportunitiesBlocks = testingPage.getOpportunitiesBlock();
        List<String> opportunities = testingPage.getOpportunities(opportunitiesBlocks);
        System.out.println(opportunities);

        testingPage.goToCategory("Дизайн");

        driver.quit();
    }
}
