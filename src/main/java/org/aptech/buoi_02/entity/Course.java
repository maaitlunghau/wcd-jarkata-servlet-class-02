package org.aptech.buoi_02.entity;

public class Course {
    // 1. Properties
    int id;
    String code, name, semester;

    // 2. Parameterized Constructor
    public Course(int id, String code, String name, String semester) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.semester = semester;
    }

    // 3. Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
