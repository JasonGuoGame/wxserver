package com.xin.fa.bao.server.entity;

import com.xin.fa.bao.server.enums.Gender;

import java.sql.Timestamp;

/**
 * Created by scnyig on 2018/6/19.
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private Long phone;
    private String title;
    private String description;
    private Gender gender;
    private String profilePicture;
    private Timestamp lastUpdated;

    public Timestamp getLastUpdated() {
        return lastUpdated;
    }
    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
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
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getProfilePicture() {
        return profilePicture;
    }
    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
