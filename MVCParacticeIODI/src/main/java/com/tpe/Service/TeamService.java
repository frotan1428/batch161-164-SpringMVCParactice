package com.tpe.Service;

import com.tpe.domain.Course;
import com.tpe.repository.CloudDBRepository;
import com.tpe.repository.LocalDBRepository;
import com.tpe.repository.Repo;

public class TeamService implements CourseService{

    @Override
    public void teachCourse(Course course){
        System.out.println("Teaching Course " +course.getCourseName() + " through the Team  Service " );
    }

    @Override
    public void saveCourse(Course course) {

        Repo repo = new LocalDBRepository();
        repo.saveCourse(course);
    }


}
