package com.project.musicplayer.entities;

import java.util.UUID;

public class User {
    private String username;

    private final String PASSWORD = UUID.randomUUID().toString();
    private String email;
    private String address;
    private String phoneNumber;

    public User(String username, String email, String address, String phoneNumber) {
        this.username = username;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\n' +
                ", PASSWORD='" + PASSWORD + '\n' +
                ", email='" + email + '\n' +
                ", address='" + address + '\n' +
                ", phoneNumber='" + phoneNumber + '\n' +
                '}';
    }
}
