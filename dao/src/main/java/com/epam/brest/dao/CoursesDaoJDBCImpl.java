package com.epam.brest.dao;

import com.epam.brest.model.Courses;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class CoursesDaoJDBCImpl implements CoursesDao{

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public CoursesDaoJDBCImpl(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public List<Courses> findAll() {
        return null;
    }

    @Override
    public Integer create(Courses courses) {
        return null;
    }

    @Override
    public Integer update(Courses courses) {
        return null;
    }

    @Override
    public Integer delete(Integer coursesId) {
        return null;
    }
}
