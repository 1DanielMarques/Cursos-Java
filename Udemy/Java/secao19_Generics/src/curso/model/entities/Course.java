package curso.model.entities;

import curso.model.entities.enums.CourseName;

public class Course {
    private CourseName name;

    public Course(CourseName name) {
        this.name = name;
    }

    public CourseName getName() {
        return name;
    }

    public void setName(CourseName name) {
        this.name = name;
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
