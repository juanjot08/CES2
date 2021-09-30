package net.SoftwareDos.BackendJava.Shared.dto;

import java.io.Serializable;

public class Userdto implements Serializable{

    private static final long serialVersionUID= 1L;

    private long id;
    private String UserId;
    private String FirstName;
    private String LastName;
    private String Email;
    private String encryptedPassword;
    
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getUserId() {
        return UserId;
    }
    public void setUserId(String userId) {
        UserId = userId;
    }
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getEncryptedPassword() {
        return encryptedPassword;
    }
    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    
}
