package com.rendessy.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;//used to mark Java classes so that objects of these
                    // classes may get a certain capability

@Entity  //used to map to DB
public class Employee implements Serializable {
    @Id //generates primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)//cannot change
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;//points to actual image--not stored
    @Column(nullable = false, updatable = false)//cannot change
    private String employeeCode;
//Generate getters and setters for Class
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {//This will be used in case want to print out!!
        //Creates a nice format
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
