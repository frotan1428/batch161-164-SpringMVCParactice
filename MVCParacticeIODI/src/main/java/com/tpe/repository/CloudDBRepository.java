package com.tpe.repository;

import com.tpe.domain.Course;

public class CloudDBRepository implements Repo{
    @Override
    public void saveCourse(Course course) {
        System.out.println("Course " + course.getCourseName()+" info has been saved to CloudService");
    }
}
