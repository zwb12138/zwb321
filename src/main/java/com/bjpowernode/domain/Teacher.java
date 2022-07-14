package com.bjpowernode.domain;

public class Teacher {
    private  String name;
    private  Student student;

    public Teacher(String name, Student student) {
        this.name = name;
        this.student = student;
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", student=" + student +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
