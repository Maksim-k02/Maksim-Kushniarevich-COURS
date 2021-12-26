DROP TABLE IF EXISTS department;
CREATE TABLE courses(
    coursesId INT NOT NULL AUTO_INCREMENT,
    coursesName VARCHAR(20) NOT NULL UNIQUE,
    PRIMARY KEY (coursesId)
);