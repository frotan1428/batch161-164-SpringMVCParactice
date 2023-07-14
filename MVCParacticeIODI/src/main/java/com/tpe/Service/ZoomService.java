package com.tpe.Service;

import com.tpe.domain.Course;

public class ZoomService implements CourseService{


   @Override
    public void teachCourse(Course course){
        System.out.println("Teaching Course " +course.getCourseName() + " through the zoom Service " );
    }

    @Override
    public void saveCourse(Course course) {

    }


}
