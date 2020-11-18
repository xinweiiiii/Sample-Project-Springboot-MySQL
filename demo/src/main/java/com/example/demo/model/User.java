package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    private int id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;

    public User() {
    }

    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        // this.deviceID = deviceID;
        // this.email = email;
        // this.employeeID = employeeID;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
   
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // public String getDeviceID(){
    //     return deviceID;
    // }

    // public void setDeviceID(String deviceID){
    //     this.deviceID = deviceID;
    // }

    // public String getEmail(){
    //     return email;
    // }

    // public void setEmail(String email){
    //     this.email = email;
    // }

    // public String getEmployeeID(){
    //     return employeeID;
    // }

    // public void setEmployeeID(String employeeID){
    //     this.employeeID = employeeID;
    // }
}