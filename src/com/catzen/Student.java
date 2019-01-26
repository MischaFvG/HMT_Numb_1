package com.catzen;

import com.catzen.Person;

public class Student extends Person {
   private String university;
   private String faculty;
   private String group;

    public Student() {
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", university='" + university + '\'' +
                ", age=" + age +
                ", faculty='" + faculty + '\'' +
                ", sex='" + sex + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
