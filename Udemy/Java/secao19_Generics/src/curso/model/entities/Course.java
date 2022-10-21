package curso.model.entities;

import curso.model.entities.enums.CourseName;

public class Course {
    private CourseName name;
    private Instructor instructor;

    public Course(CourseName name, Instructor instructor) {
        this.name = name;
        this.instructor = instructor;
    }

    public CourseName getName() {
        return name;
    }

    public void setName(CourseName name) {
        this.name = name;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        return name == course.name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
