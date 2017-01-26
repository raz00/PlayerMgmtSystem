/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nepal.springfirst.entity;

import java.util.Date;

/**
 *
 * @author Raju
 */
public class Player {
    private int id;
    private String firstName, lastName, email,squadPosition, contactNo;
    private Date joinedDate, modifiedDate;
    private boolean status;

    
    public Player() {
    }

    public Player(int id, String firstName, String lastName, String email, String squadPosition, String contactNo, boolean status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.squadPosition = squadPosition;
        this.contactNo = contactNo;
        this.status = status;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSquadPosition() {
        return squadPosition;
    }

    public void setSquadPosition(String squadPosition) {
        this.squadPosition = squadPosition;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public String toString() {
        return "Player{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", squadPosition=" + squadPosition + ", ContactNo=" + contactNo + ", joinedDate=" + joinedDate + ", modifiedDate=" + modifiedDate + ", status=" + status + '}';
    }
   
       
    
    
}
