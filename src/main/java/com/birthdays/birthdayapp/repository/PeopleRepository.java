package com.birthdays.birthdayapp.repository;

import com.birthdays.birthdayapp.model.People;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PeopleRepository extends JpaRepository<People, Integer> {
    List<People> getAllByName(String name);

    List<People> getAllBySurname(String surname);

}
