package com.example.nhom22.service;

import com.example.nhom22.model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseService {
    private List<Course> listCourse = new ArrayList<>();
    public void add(Course newProduct){ listCourse.add(newProduct);}
    public List<Course> GetAll() {return listCourse;}
}
