package com.birthdays.birthdayapp.service.impl;

import com.birthdays.birthdayapp.model.People;
import com.birthdays.birthdayapp.repository.PeopleRepository;
import com.birthdays.birthdayapp.service.PeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PeopleServiceImpl implements PeopleService {

    private  PeopleRepository peopleRepository;

    @Autowired
    public PeopleServiceImpl(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }


    @Override
    public List<People> getAll() {
        return peopleRepository.findAll();
    }
}
