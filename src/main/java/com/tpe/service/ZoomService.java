package com.tpe.service;

import com.tpe.Thirdparty.InstructorService;
import com.tpe.domain.Course;
import com.tpe.repository.CloudRepository;
import com.tpe.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("zoomService")
public class ZoomService implements CourseService{


        //1 filed Injection
//    @Qualifier("cloudRepository")
//    @Autowired
//    private Repository repository;


    // 2 setter Injection


//    @Qualifier("cloudRepository")
//    @Autowired
//    private Repository repository;
//    public void setRepository(Repository repository) {
//        this.repository = repository;
//    }
//

    //3 Constructor Injection


    @Autowired //this optional
    @Qualifier("cloudRepository")
    private Repository repository;

    public ZoomService(@Qualifier("cloudRepository") Repository repository) {
        this.repository = repository;
    }

    @Autowired
    private InstructorService instructorService;


    @Autowired
    private Random random;


    @Value("${app.code}")
    String code ;

    @Value("${app.email}")
    String email;

    @Override
    public void teachCourse(Course course) {
        System.out.println(course.getName() + " " + " course explained by Zoom   Service ");
        System.out.println(code + " -" +course.getName()+ "  explain By Zoom Service  ");
        System.out.println("my mail : "+email);

        instructorService.teach(course.getName() ,"FROTAN");
}
    @Override
    public void saveCourse(Course course) {
        repository.save(course);
    }
}
