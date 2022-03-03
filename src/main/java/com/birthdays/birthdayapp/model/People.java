package com.birthdays.birthdayapp.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Entity
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String surname;

    private long dob;

    public People(String name, String surname, long dob) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
    }

    public People() {
    }
}
