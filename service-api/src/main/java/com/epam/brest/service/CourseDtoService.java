package com.epam.brest.service;

import com.epam.brest.model.dto.CourseDto;

import java.util.List;

public interface CourseDtoService {

    /**
     * Get list of course Dto.
     *
     * @return list of course Dto.
     */

    List<CourseDto> findAllWithAvgSalary();
}
