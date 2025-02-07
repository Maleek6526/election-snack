package com.example.springboots.Student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    public Student(){
    }

    public Student(Long id,String name,String email,LocalDate dob, Integer age){
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Student(String name,String email,LocalDate dob, Integer age){
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public LocalDate getDob(){
        return dob;
    }
    public Integer getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "Student{" + "id=" + id + ", name = '" + name + '\'' + ", email='" + email + '\'' + ", dob=" + dob + ", age=" + age + '}';}







}
