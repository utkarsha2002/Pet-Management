package com.example.petmanagement;

public class HelperClass {
    String  email, username, password,conformPassword;

    public String getConformPassword() {
        return conformPassword;
    }

    public void setConformPassword(String conformPassword) {
        this.conformPassword = conformPassword;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public HelperClass(String email, String username, String password, String conformPassword) {

        this.email = email;
        this.username = username;
        this.password = password;
        this.conformPassword = conformPassword;
    }

    public HelperClass() {
    }
}
