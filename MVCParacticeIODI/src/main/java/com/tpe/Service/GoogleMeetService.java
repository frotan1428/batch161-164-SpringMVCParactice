package com.tpe.Service;

import com.tpe.domain.Course;

public class GoogleMeetService implements CourseService{

    @Override
    public void teachCourse(Course course){
        System.out.println("Teaching Course " +course.getCourseName() + " through the google meet  Service " );
    }

    @Override
    public void saveCourse(Course course) {

    }


}
