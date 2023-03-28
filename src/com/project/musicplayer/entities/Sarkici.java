package com.project.musicplayer.entities;

public class Sarkici {
    private String name;
    private String lastName;

    public Sarkici(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addSarkici(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Sarkici{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
