package com.epam.brest.dao;

import com.epam.brest.model.Courses;

import java.util.List;

public interface CoursesDao {

    List<Courses> findAll();

    Integer create(Courses courses);

    Integer update(Courses courses);

    Integer delete(Integer coursesId);

}
