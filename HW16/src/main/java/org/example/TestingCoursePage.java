package org.example;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.List;

public class TestingCoursePage extends CoursePage implements AdditionalCoursesProvider {

    public TestingCoursePage(ElementsCollection coursesBlocks, ElementsCollection additionalCoursesBlocks,
                             ElementsCollection opportunitiesBlocks, ElementsCollection categories) {
        super(coursesBlocks, additionalCoursesBlocks, opportunitiesBlocks, categories);
    }

    @Override
    public List<AdditionalCourse> getAdditionalCoursesBlocks() {
        List<AdditionalCourse> additionalCourseList = new ArrayList<>();
        for (SelenideElement additionalCourse : additionalCoursesBlocks) {
            additionalCourseList.add(new AdditionalCourse(additionalCourse));
        }
        return additionalCourseList;
    }

    @Override
    public List<String> getAdditionalCoursesNames(List<AdditionalCourse> additionalCourseList) {
        List<String> additionalCoursesNames = new ArrayList<>();
        for (AdditionalCourse course : additionalCourseList) {
            additionalCoursesNames.add(course.getCourses());
        }
        return additionalCoursesNames;
    }

}
