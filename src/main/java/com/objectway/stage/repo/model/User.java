package com.objectway.stage.repo.model;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    private Integer idRef;
    private String name;
    private String lastName;
    private String role;
    private String userName;
    private String password;


    public Integer getIdRef() { return idRef;}

    public void setIdRef(Integer idRef) {this.idRef = idRef;}

    public String getName() { return name;}

    public void setName(String name) { this.name = name;}

    public String getLastName() { return lastName;}

    public void setLastName(String lastName) { this.lastName = lastName;}

    public String getRole() { return role;}

    public void setRole(String role) { this.role = role;}

    public String getUserName() { return userName;}

    public void setUserName(String userName) { this.userName = userName;}

    public String getPassword() { return password;}

    public void setPassword(String password) { this.password = password;}
}
