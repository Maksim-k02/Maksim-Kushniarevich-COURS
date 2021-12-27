package com.epam.brest.dao;

import com.epam.brest.model.Course;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class CourseDaoJDBCImpl implements CourseDao {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public CourseDaoJDBCImpl(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public List<Course> findAll() {
        return null;
    }

    @Override
    public Integer create(Course courses) {
        return null;
    }

    @Override
    public Integer update(Course courses) {
        return null;
    }

    @Override
    public Integer delete(Integer coursesId) {
        return null;
    }
}
