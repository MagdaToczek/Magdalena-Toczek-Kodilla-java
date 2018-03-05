package com.kodilla.good.patterns.challenges.order;

public final class User {
    private final String name;
    private final String surname;
    private final String address;
    private final String phoneNumber;
    private final String mail;

    public User(final String name, final String surname, final String address, final String phoneNumber, final String mail) {
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
