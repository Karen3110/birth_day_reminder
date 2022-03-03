package com.birthdays.birthdayapp.controller;

import com.birthdays.birthdayapp.model.People;
import com.birthdays.birthdayapp.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class PeopleController {
    @Autowired
    private PeopleService peopleService;

    @GetMapping
    List<People> getAll() {
        return peopleService.getAll();
    }

}
