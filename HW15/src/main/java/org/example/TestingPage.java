package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class TestingPage {

    private WebDriver driver;
    @FindBy(css = "div.block-profession_group:first-child div.profession-bar_body")
    private List<WebElement> testCoursesBlock;

    @FindBy(css = "div.block-profession_group:nth-of-type(2) div.profession-bar_body")
    private List<WebElement> additionalCoursesBlock;

    @FindBy(css = "li.opportunities_item.opportunity-item:not(.-first)")
    private List<WebElement> opportunitiesBlock;

    @FindBy(css = "li.categories_item")
    private List<WebElement> categories;

    @FindBy(css = "a.categories_link.btn")
    private WebElement categoryLink;

    public TestingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public List<TestCourse> getCoursesBlock() {
        List<TestCourse> testCourseList = new ArrayList<>();
        for (WebElement course : testCoursesBlock) {
            testCourseList.add(new TestCourse(driver, course));
        }
        return testCourseList;
    }

    public List<String> getCourses(List<TestCourse> testCourseList) {
        List<String> courses = new ArrayList<>();
        for (TestCourse course : testCourseList) {
            courses.add(course.getCourses());
        }
        return courses;
    }

    public List<AdditionalCourse> getAdditionalCoursesBlock() {
        List<AdditionalCourse> additionalCourseList = new ArrayList<>();
        for (WebElement course : additionalCoursesBlock) {
            additionalCourseList.add(new AdditionalCourse(driver, course));
        }
        return additionalCourseList;
    }

    public List<String> getAdditionalCourses(List<AdditionalCourse> additionalCourseList) {
        List<String> additionalCourses = new ArrayList<>();
        for (AdditionalCourse course : additionalCourseList) {
            additionalCourses.add(course.getCourses());
        }
        return additionalCourses;
    }

    public List<OpportunityBlock> getOpportunitiesBlock() {
        List<OpportunityBlock> opportunitiesList = new ArrayList<>();
        for (WebElement opportunity : opportunitiesBlock) {
            opportunitiesList.add(new OpportunityBlock(driver, opportunity));
        }
        return opportunitiesList;
    }

    public List<String> getOpportunities(List<OpportunityBlock> opportunityBlockList) {
        List<String> opportunities = new ArrayList<>();
        for (OpportunityBlock opportunity : opportunityBlockList) {
            opportunities.add(opportunity.getOpportunityTitle());
        }
        return opportunities;
    }

    public void goToCategory(String category) {
        for (WebElement categoryElement : categories) {
            String categoryName = new Category(driver, categoryElement).getCategoryName();
            if (categoryName.equals(category)) {
                categoryElement.click();
                return;
            }
        }
        throw new NoSuchElementException("Wrong category: " + category);
    }
}
