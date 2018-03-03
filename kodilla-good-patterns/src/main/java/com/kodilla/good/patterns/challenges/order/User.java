package com.kodilla.good.patterns.challenges.order;

public class User {
    private String name;
    private String surname;
    private String address;
    private String phoneNumber;
    private String mail;

    public User(String name, String surname, String address, String phoneNumber, String mail) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMail() {
        return mail;
    }
}
