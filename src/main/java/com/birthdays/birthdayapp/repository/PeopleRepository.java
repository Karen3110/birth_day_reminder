package com.birthdays.birthdayapp.repository;

import com.birthdays.birthdayapp.model.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PeopleRepository extends JpaRepository<People, Integer> {

}


