package com.birthdays.birthdayapp.service;

import com.birthdays.birthdayapp.model.dto.PeopleDto;

import java.util.List;

public interface PeopleService {
    List<PeopleDto> getAll();

    PeopleDto save(PeopleDto peopleDto);

    void delete(int id);

    List<PeopleDto> getAllByName(String name);

    List<PeopleDto> getAllBySurname(String surname);
}
