package com.gerenciador.personpai.repository;

import com.gerenciador.personpai.entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
