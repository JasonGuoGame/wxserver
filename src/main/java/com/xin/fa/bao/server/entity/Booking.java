package com.xin.fa.bao.server.entity;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Created by scnyig on 2018/6/19.
 */
public class Booking {
    private int id;
    private Date date;
    private Time hour;
    private int employeeId;
    private int serviceId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String serviceName;
    private String employeeName;
    private Time serviceDuration;
    private int servicePrice;
    private int isActive;
    private Timestamp created;


    public Timestamp getCreated() {
        return created;
    }
    public void setCreated(Timestamp created) {
        this.created = created;
    }
    public int getIsActive() {
        return isActive;
    }
    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }
    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public Time getServiceDuration() {
        return serviceDuration;
    }
    public void setServiceDuration(Time serviceDuration) {
        this.serviceDuration = serviceDuration;
    }
    public int getServicePrice() {
        return servicePrice;
    }
    public void setServicePrice(int servicePrice) {
        this.servicePrice = servicePrice;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Time getHour() {
        return hour;
    }
    public void setHour(Time hour) {
        this.hour = hour;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public int getServiceId() {
        return serviceId;
    }
    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
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
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
