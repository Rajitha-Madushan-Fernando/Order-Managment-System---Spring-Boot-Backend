package com.rajithadev.springboot.message.request;

import javax.validation.constraints.NotBlank;

public class LoginForm {
    @NotBlank(message ="User Name is Required")
    private String username;
 
    @NotBlank(message ="Password is Required")
    private String password;
 
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
}