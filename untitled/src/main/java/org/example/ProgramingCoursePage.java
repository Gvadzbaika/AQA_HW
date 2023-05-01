package org.example;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static com.codeborne.selenide.Selenide.*;

public class ProgramingCoursePage extends CoursePage implements AdditionalCoursesProvider {
    private ElementsCollection programingLanguages = $$("li.subcategories_item");

    public ProgramingCoursePage(ElementsCollection coursesBlocks, ElementsCollection additionalCoursesBlocks,
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

    public void selectProgramLanguage(String language) {
        for (SelenideElement programLanguageElement : programingLanguages) {
            String programLanguageName = new ProgramingLanguage(programLanguageElement).getLanguageName();
            if (programLanguageName.equals(language)) {
                programLanguageElement.click();
                return;
            }
        }
        throw new NoSuchElementException("There is no such category: " + language);
    }
}
