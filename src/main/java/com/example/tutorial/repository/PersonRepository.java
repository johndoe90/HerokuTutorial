package com.example.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tutorial.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
