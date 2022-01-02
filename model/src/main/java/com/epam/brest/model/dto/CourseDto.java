package com.epam.brest.model.dto;

import java.math.BigDecimal;

/**
 * POJO Department for model.
 */
public class CourseDto {

    /**
     * Course Id.
     */
    private Integer courseId;

    /**
     * Course Name.
     */
    private String courseName;

//
//    /**
//     * Average salary of the Course.
//     */
//    private BigDecimal avgSalary;

    /**
     * Constructor without arguments.
     */
    public CourseDto() {
    }

    /**
     * Constructor with course name.
     *
     * @param courseName course name
     */
    public CourseDto(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Returns <code>Integer</code> representation of this courseId.
     *
     * @return courseId Course Id.
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * Sets the course's identifier.
     *
     * @param courseId Course Id.
     */
    public void setCourseId(final Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * Returns <code>String</code> representation of this courseName.
     *
     * @return courseName Course Name.
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Sets the course's name.
     *
     * @param courseName Course Name.
     */
    public void setCourseName(final String courseName) {
        this.courseName = courseName;
    }

//    /**
//     * Returns <code>BigDecimal</code> representation of average salary
//     * for the Course.
//     *
//     * @return courseId.
//     */
//    public BigDecimal getAvgSalary() {
//        return avgSalary;
//    }
//
//    /**
//     * Sets the course's average salary.
//     *
//     * @param avgSalary Average salary.
//     */
//    public void setAvgSalary(final BigDecimal avgSalary) {
//        this.avgSalary = avgSalary;
//    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "CourseDto{"
                + "courseId=" + courseId
                + ", courseName='" + courseName + /*'\''
                + ", avgSalary=" + avgSalary*/

                 '}';
    }
}