package com.example.demo.service;


import com.example.demo.modal.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<Integer> findAllCourses(){

        return courseRepository.findAllCourses();
    }

    public List<Integer> searchByCourseName(String input){

        return courseRepository.searchByCourseName(input);
    }

}
