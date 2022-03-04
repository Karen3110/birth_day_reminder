package com.birthdays.birthdayapp.service.impl;

import com.birthdays.birthdayapp.model.People;
import com.birthdays.birthdayapp.model.dto.PeopleDto;
import com.birthdays.birthdayapp.repository.PeopleRepository;
import com.birthdays.birthdayapp.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    PeopleRepository peopleRepository;

    @Override
    public List<PeopleDto> getAll() {
        List<People> fromDb = peopleRepository.findAll();
        return parseToDto(fromDb);
    }

    @Override
    public PeopleDto save(PeopleDto peopleDto) {
        People people = new People();
        people.setId(0);
        people.setName(peopleDto.getName());
        people.setSurname(peopleDto.getSurname());
        try {
            people.setDob(new SimpleDateFormat("dd/MM/yyyy").parse(peopleDto.getDob()).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        People save = peopleRepository.save(people);
        peopleDto.setId(save.getId());
        return peopleDto;
    }

    @Override
    public void delete(int id) {
        peopleRepository.deleteById(id);
    }

    @Override
    public List<PeopleDto> getAllByName(String name) {
        List<People> fromDb = peopleRepository.getAllByName(name);
        List<PeopleDto> resp = parseToDto(fromDb);
        return resp;
    }

    @Override
    public List<PeopleDto> getAllBySurname(String surname) {
        List<People> fromDb = peopleRepository.getAllBySurname(surname);
        List<PeopleDto> resp = parseToDto(fromDb);
        return resp;
    }


    List<PeopleDto> parseToDto(List<People> fromDb) {
        List<PeopleDto> resp = new LinkedList<>();

        fromDb.forEach(item -> {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(item.getDob());

            int mYear = calendar.get(Calendar.YEAR);
            int mMonth = calendar.get(Calendar.MONTH);
            int mDay = calendar.get(Calendar.DAY_OF_MONTH);
            String ds = mDay + "/" + (mMonth + 1) + "/" + mYear;


            resp.add(new PeopleDto(item.getId(), item.getName(), item.getSurname(), ds));
        });
        return resp;
    }
}
