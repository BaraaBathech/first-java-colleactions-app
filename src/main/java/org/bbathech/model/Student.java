package org.bbathech.model;

import java.util.Objects;

public class Student {

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object otherPerson) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) otherPerson;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
}
