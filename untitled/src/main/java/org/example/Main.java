package org.example;

import java.util.List;
import static com.codeborne.selenide.Selenide.*;

public class Main {
    public static void main(String[] args) {

        open("https://ithillel.ua");
        HomePage homePage = new HomePage();
        homePage.clickOnProgramCourse();

        TestingCoursePage testingPage = new TestingCoursePage($$("div.block-profession_group:first-child div.profession-bar_body"),
                $$("div.block-profession_group:nth-of-type(2) div.profession-bar_body"),
                $$("li.opportunities_item.opportunity-item:not(.-first)"), $$("li.categories_item"));

        List<Course> testBlocks = testingPage.getCoursesBlocks();
        List<String> testCourses = testingPage.getCourses(testBlocks);
        System.out.println(testCourses);

        List<AdditionalCourse> additionalTestCourses = testingPage.getAdditionalCoursesBlocks();
        List<String> additionalTestCoursesNames = testingPage.getAdditionalCoursesNames(additionalTestCourses);
        System.out.println(additionalTestCoursesNames);

        List<OpportunityBlock> testOpportunitiesBlocks = testingPage.getOpportunitiesBlocks();
        List<String> testOpportunities = testingPage.getOpportunities(testOpportunitiesBlocks);
        System.out.println(testOpportunities);

        testingPage.goToCategory("Програмування");

        ProgramingCoursePage frontEndProgramingPage = new ProgramingCoursePage($$("[data-for='front-end'] div.block-profession_group:first-child div.profession-bar_body"),
                $$("div.block-profession_group:nth-of-type(2) div.profession-bar_body"),
                $$("li.opportunities_item.opportunity-item:not(.-first)"), $$("li.categories_item"));

        List<Course> frontEndBlocks = frontEndProgramingPage.getCoursesBlocks();
        List<String> frontEndCourses = frontEndProgramingPage.getCourses(frontEndBlocks);
        System.out.println(frontEndCourses);

        List<AdditionalCourse> additionalFrontEndCourses = frontEndProgramingPage.getAdditionalCoursesBlocks();
        List<String> additionalFrontEndCoursesNames = frontEndProgramingPage.getAdditionalCoursesNames(additionalFrontEndCourses);
        System.out.println(additionalFrontEndCoursesNames);

        List<OpportunityBlock> frontEndOpportunitiesBlocks = frontEndProgramingPage.getOpportunitiesBlocks();
        List<String> frontEndOpportunities = frontEndProgramingPage.getOpportunities(frontEndOpportunitiesBlocks);
        System.out.println(frontEndOpportunities);

        frontEndProgramingPage.selectProgramLanguage("PHP");

        frontEndProgramingPage.goToCategory("Дизайн");

        DesignCoursePage designPage = new DesignCoursePage($$("div.block-profession_group:first-child div.profession-bar_body"),
                $$("li.opportunities_item.opportunity-item:not(.-first)"), $$("li.categories_item"));

        List<Course> designBlocks = designPage.getCoursesBlocks();
        List<String> designCourses = designPage.getCourses(designBlocks);
        System.out.println(designCourses);

        List<OpportunityBlock> designOpportunitiesBlocks = designPage.getOpportunitiesBlocks();
        List<String> designOpportunities = designPage.getOpportunities(designOpportunitiesBlocks);
        System.out.println(designOpportunities);

        closeWebDriver();
    }

}
