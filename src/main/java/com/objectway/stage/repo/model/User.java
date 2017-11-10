package com.objectway.stage.repo.model;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    private Integer idRef;
    private String name;
    private String cognome;
    private String ruolo;
    private String userName;
    private String password;


    public Integer getIdRef() { return idRef;}

    public void setIdRef(Integer idRef) {this.idRef = idRef;}

    public String getName() { return name;}

    public void setName(String name) { this.name = name;}

    public String getCognome() { return cognome;}

    public void setCognome(String cognome) { this.cognome = cognome;}

    public String getRuolo() { return ruolo;}

    public void setRuolo(String ruolo) { this.ruolo = ruolo;}

    public String getUserName() { return userName;}

    public void setUserName(String userName) { this.userName = userName;}

    public String getPassword() { return password;}

    public void setPassword(String password) { this.password = password;}
}
