package com.objectway.stage.repo.model;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    private Integer idRef;
    private String name;
    private String cognome;
    private String ruolo;
    private List<String> userName;
    private List<String> password;


    public Integer getIdRef() { return idRef;}

    public void setIdRef(Integer idRef) {this.idRef = idRef;}

    public String getName() { return name;}

    public void setName(String name) { this.name = name;}

    public String getCognome() { return cognome;}

    public void setCognome(String cognome) { this.cognome = cognome;}

    public String getRuolo() { return ruolo;}

    public void setRuolo(String ruolo) { this.ruolo = ruolo;}

    public List<String> getUserName() { return userName;}

    public void setUserName(List<String> userName) { this.userName = userName;}

    public List<String> getPassword() { return password;}

    public void setPassword(List<String> password) { this.password = password;}
}
