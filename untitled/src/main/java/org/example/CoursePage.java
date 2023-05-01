package org.example;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class CoursePage implements CoursesProvider, OpportunitiesProvider {

    protected ElementsCollection coursesBlocks;
    protected ElementsCollection additionalCoursesBlocks;
    protected ElementsCollection opportunitiesBlocks;
    protected ElementsCollection categories;


    public CoursePage(ElementsCollection coursesBlocks, ElementsCollection additionalCoursesBlocks,
                      ElementsCollection opportunitiesBlocks, ElementsCollection categories) {
        this.coursesBlocks = coursesBlocks;
        this.additionalCoursesBlocks = additionalCoursesBlocks;
        this.opportunitiesBlocks = opportunitiesBlocks;
        this.categories = categories;
    }

    public CoursePage(ElementsCollection coursesBlocks, ElementsCollection opportunitiesBlocks, ElementsCollection categories) {
        this.coursesBlocks = coursesBlocks;
        this.opportunitiesBlocks = opportunitiesBlocks;
        this.categories = categories;
    }

    @Override
    public List<Course> getCoursesBlocks() {
        List<Course> courseList = new ArrayList<>();
        for (SelenideElement course : coursesBlocks) {
            courseList.add(new Course(course));
        }
        return courseList;
    }

    @Override
    public List<String> getCourses(List<Course> courseList) {
        List<String> courses = new ArrayList<>();
        for (Course course : courseList) {
            courses.add(course.getCourses());
        }
        return courses;
    }

    @Override
    public List<OpportunityBlock> getOpportunitiesBlocks() {
        List<OpportunityBlock> opportunitiesList = new ArrayList<>();
        for (SelenideElement opportunity : opportunitiesBlocks) {
            opportunitiesList.add(new OpportunityBlock(opportunity));
        }
        return opportunitiesList;
    }

    @Override
    public List<String> getOpportunities(List<OpportunityBlock> opportunityBlockList) {
        List<String> opportunities = new ArrayList<>();
        for (OpportunityBlock opportunity : opportunityBlockList) {
            opportunities.add(opportunity.getOpportunityTitle());
        }
        return opportunities;
    }

    public void goToCategory(String category) {
        for (SelenideElement categoryElement : categories) {
            String categoryName = new Category(categoryElement).getCategoryName();
            if (categoryName.equals(category)) {
                categoryElement.click();
                return;
            }
        }
        throw new NoSuchElementException("There is no such category: " + category);
    }

}
