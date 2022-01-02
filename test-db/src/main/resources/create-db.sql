DROP TABLE IF EXISTS student;

DROP TABLE IF EXISTS course;

CREATE TABLE course
(
    course_id int NOT NULL auto_increment,
    course_name varchar(50) NOT NULL UNIQUE,
    CONSTRAINT course_pk PRIMARY KEY (course_id)
);

CREATE TABLE student (
    student_id int NOT NULL auto_increment,
    firstname varchar(255) NOT NULL,
    lastname varchar(255) NOT NULL,
    email varchar(255) NOT NULL UNIQUE,
    course_id int NOT NULL,
        CONSTRAINT student_pk PRIMARY KEY (student_id),
        CONSTRAINT student_course_fk FOREIGN KEY (course_id) REFERENCES course(course_id)
);