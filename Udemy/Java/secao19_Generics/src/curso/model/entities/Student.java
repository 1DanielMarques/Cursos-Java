package curso.model.entities;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private int id;
    private Set<Course> courses = new HashSet<>();

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return courses.equals(student.courses);
    }

    @Override
    public int hashCode() {
        return courses.hashCode();
    }
}
