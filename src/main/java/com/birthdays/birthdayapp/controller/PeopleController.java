package com.birthdays.birthdayapp.controller;

import com.birthdays.birthdayapp.model.People;
import com.birthdays.birthdayapp.service.PeopleService;
import com.birthdays.birthdayapp.service.impl.PeopleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/birthday-app/people")
public class PeopleController {

    private final PeopleService peopleService = new PeopleServiceImpl();

    @GetMapping("/get-all")
    public ResponseEntity<List<People>> getAll() {
        return ResponseEntity.ok().body(peopleService.getAll());
    }


}
