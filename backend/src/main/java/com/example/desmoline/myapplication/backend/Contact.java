package com.example.desmoline.myapplication.backend;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

/** The object model for the data we are sending through endpoints */
@Entity
public class Contact {

    @Id
    private Long id;
    private String name;
    private String email;
    private String tel_num1;
    private String tel_num2;
    private String tel_num3;
    private String homeAddress;
    private String dateCreated;


    public Long getId(){
        return id;
    }
    public String getEmail() {
        return email;
    }
    public String getHomeAddress() {
        return homeAddress;
    }
    public String getDateCreated() {
        return dateCreated;
    }


    public void setId(Long id){
        this.id = id;
    }

    public String getTel_num1() {
        return tel_num1;
    }

    public void setTel_num1(String tel_num1) {
        this.tel_num1 = tel_num1;
    }

    public String getTel_num2() {
        return tel_num2;
    }

    public void setTel_num2(String tel_num2) {
        this.tel_num2 = tel_num2;
    }

    public String getTel_num3() {
        return tel_num3;
    }

    public void setTel_num3(String tel_num3) {
        this.tel_num3 = tel_num3;
    }

    public void setName(String name) {

        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getName() {
        return name;
    }

}