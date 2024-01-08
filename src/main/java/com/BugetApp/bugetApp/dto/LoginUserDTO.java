package com.BugetApp.bugetApp.dto;


import com.BugetApp.bugetApp.model.User;

public class LoginUserDTO {

    private User user;
    private String jwt;

    public LoginUserDTO(){
        super();
    }

    public LoginUserDTO(User user, String jwt){
        this.user = user;
        this.jwt = jwt;
    }

    public User getUser(){
        return this.user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public String getJwt(){
        return this.jwt;
    }

    public void setJwt(String jwt){
        this.jwt = jwt;
    }


}
