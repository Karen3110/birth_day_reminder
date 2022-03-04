package com.birthdays.birthdayapp.controller;

import com.birthdays.birthdayapp.model.dto.PeopleDto;
import com.birthdays.birthdayapp.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {
    @Autowired
    private PeopleService peopleService;

    @GetMapping("/get-all")
    List<PeopleDto> getAll() {
        return peopleService.getAll();
    }

    @GetMapping("/get-name/{name}")
    List<PeopleDto> getAllByName(@PathVariable String name) {
        return peopleService.getAllByName(name);
    }

    @GetMapping("/get-surname/{surname}")
    List<PeopleDto> getAllBySurname(@PathVariable String surname) {
        return peopleService.getAllBySurname(surname);
    }

    @PostMapping
    PeopleDto save(@RequestBody PeopleDto peopleDto) {
        peopleDto.setId(0);
        return peopleService.save(peopleDto);
    }

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable("id") int id) {
        peopleService.delete(id);
    }


}
