package com.google;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person {
        private  String firstName;
        private String lastName;
        private String email;

    /*public Person(String firstName, String lastName, String email, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }*/

    private String phone;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    private  String address;

}
