package com.epam.brest.dao;

import com.epam.brest.model.Course;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath*:test-db.xml", "classpath*:test-jdbc-conf.xml"})
class CourseDaoJDBCImplTest {

    CourseDaoJDBCImpl courseDaoJDBC;

    public CourseDaoJDBCImplTest(@Autowired CourseDao courseDaoJDBC) {
        this.courseDaoJDBC = (CourseDaoJDBCImpl) courseDaoJDBC;
    }

    @Test
    void findAll() {
        assertNotNull(courseDaoJDBC);
        assertNotNull(courseDaoJDBC.findAll());
    }

    @Test
    void create() {
        assertNotNull(courseDaoJDBC);
        Integer coursesSizeBefore = courseDaoJDBC.findAll().size();
        Course course =  new Course("HTML and CSS");
        Integer newCourseId = courseDaoJDBC.create(course);


        assertNotNull(newCourseId);
        assertEquals((int) coursesSizeBefore, courseDaoJDBC.findAll().size()-1);
    }

    @Test
    void tryToCreateEqualsCourses() {
        assertNotNull(courseDaoJDBC);
        Course course =  new Course("Kotlin");

        assertThrows(DuplicateKeyException.class, ()->{
            courseDaoJDBC.create(course);
            courseDaoJDBC.create(course);
        });
    }
}