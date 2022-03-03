package com.birthdays.birthdayapp.service;

import com.birthdays.birthdayapp.model.People;
import com.birthdays.birthdayapp.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    PeopleRepository peopleRepository;

    @Override
    public List<People> getAll() {
        return peopleRepository.findAll();
    }
}
