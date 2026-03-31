package com.prachi9.springboot_mvc_demo.dto;

import java.time.LocalDate;

//it is POJO class
public class EmployeeDTO {

    private long id;
    private String name;
    private String email;
    private int age;
    private LocalDate dateOfJoining;
    private boolean isactive;

    public EmployeeDTO(){

    }

    public EmployeeDTO(long id, String name, String email, int age, LocalDate dateOfJoining, boolean isactive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
        this.isactive = isactive;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public LocalDate getDateOfJoining(){
        return dateOfJoining;
    }
    public void setDateOfJoining(LocalDate dateOfJoining){
        this.dateOfJoining = dateOfJoining;
    }
    public boolean isIsactive(){
        return isactive;
    }
    public void setIsactive(boolean isactive){
        this.isactive = isactive;
    }

}
