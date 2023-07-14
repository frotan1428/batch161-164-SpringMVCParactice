package com.tpe;

import com.tpe.Service.CourseService;
import com.tpe.Service.GoogleMeetService;
import com.tpe.Service.TeamService;
import com.tpe.Service.ZoomService;
import com.tpe.domain.Course;

public class MyApp {

    public static void main(String[] args) {

        Course course= new Course();
        course.setCourseName("Java");

//        ZoomService zoomService= new ZoomService();
//        zoomService.teachCourse(course);
//
//        GoogleMeetService googleMeetService= new GoogleMeetService();
//        googleMeetService.teachCourse(course);
//
//        TeamService teamService= new TeamService();
//        teamService.teachCourse(course);


//        CourseService courseService= new ZoomService();
//        courseService.teachCourse(course);
//
//        CourseService courseService2= new GoogleMeetService();
//        courseService2.teachCourse(course);
//

        //
//        String serviceName="zoomService";
//        CourseService courseService;
//
//        if (args.length>0)
//            serviceName=args[0];
//
//        if (serviceName.equalsIgnoreCase("zoomService")){
//            courseService=new ZoomService();
//        } else if (serviceName.equalsIgnoreCase("googleMeetService")) {
//            courseService= new GoogleMeetService();
//
//        }else {
//            courseService = new TeamService();
//        }
//        courseService.teachCourse(course);
//


        CourseService service= new TeamService();
        service.teachCourse(course);
        service.saveCourse(course);

        

    }







}
