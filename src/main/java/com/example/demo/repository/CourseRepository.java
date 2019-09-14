package com.example.demo.repository;

import com.example.demo.modal.Course;
import com.example.demo.modal.Instructor;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CourseRepository {
    List<Integer> courses = new ArrayList<>();

    // constructor
    public CourseRepository() {
        for(int i=0; i < 100; i++) {
            courses.add(i);
        }
    }

    public List<Integer> findAllCourses(){
        //链接数据库
        //返回数据库的信息
        return courses;
    }

    public List<Integer> searchByCourseName(String target) {
        int t = Integer.valueOf(target);
        if (t < 0)
            return Arrays.asList(-1, -1);

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < courses.size(); i++) {
            if(map.containsKey(courses.get(i))) {
                return  Arrays.asList(map.get(courses.get(i)), i);
            } else {
                map.put(t-courses.get(i), i);
            }
        }
        return  Arrays.asList(-1, -1);
    }
}
