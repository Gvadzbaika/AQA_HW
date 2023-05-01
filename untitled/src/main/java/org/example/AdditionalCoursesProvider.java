package org.example;

import java.util.List;

public interface AdditionalCoursesProvider {
    List<AdditionalCourse> getAdditionalCoursesBlocks();
    List<String> getAdditionalCoursesNames(List<AdditionalCourse> additionalCourseList);
}
