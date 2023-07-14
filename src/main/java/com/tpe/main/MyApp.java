package com.tpe.main;

import com.tpe.AppConfiguration;
import com.tpe.domain.Course;
import com.tpe.service.CourseService;
import com.tpe.service.ZoomService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(AppConfiguration.class);

        Course course = new Course();
        course.setName("Spring MVC");

      CourseService service =   context.getBean("zoomService",CourseService.class);
      service.teachCourse(course);
      service.saveCourse(course);

        System.out.println("---------------------");

        String beanNames[] =context.getBeanDefinitionNames();

        for (String name:beanNames){
            System.out.println("Bean Names : " +name);
        }



    }
}
