package com.tpe.service;

import com.tpe.domain.Course;
import com.tpe.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("meetService")
public class MeetService implements CourseService{


    @Autowired
    @Qualifier("cloudRepository")
    private Repository repository;

    @Override
    public void teachCourse(Course course) {

        System.out.println(course.getName() + " " + " course explained by Google Meet Service ");
    }

    @Override
    public void saveCourse(Course course) {

            repository.save(course);
    }
}
