package com.example.project;

public class UserPage {
    private String email;
    private String fname;
    private String lname;
    private String Phone;
    private int userid;

    public UserPage(String emailaddress, String firstname, String lastname, String phoneNumber, int userId) {
        this.email = emailaddress;
        this.fname = firstname;
        this.lname = lastname;
        Phone = phoneNumber;
        this.userid = userId;
    }

    public String getEmailaddress() {
        return email;
    }

    public void setEmailaddress(String emailaddress) {
        this.email = emailaddress;
    }

    public String getFirstname() {
        return fname;
    }

    public void setFirstname(String firstname) {
        this.fname = firstname;
    }

    public String getLastname() {
        return lname;
    }

    public void setLastname(String lastname) {
        this.lname = lastname;
    }

    public String getPhoneNumber() {
        return Phone;
    }

    public void setPhoneNumber(String phoneNumber) {
        Phone = phoneNumber;
    }

    public int getUserId() {
        return userid;
    }

    public void setUserId(int userId) {
        this.userid = userId;
    }
}
