package curso.model.entities;

import java.util.HashSet;
import java.util.Set;

public class Instructor {
    private String name;
    private Set<Course> courses = new HashSet<>();

    public Instructor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

        Instructor that = (Instructor) o;

        return courses.equals(that.courses);
    }

    @Override
    public int hashCode() {
        return courses.hashCode();
    }
}
