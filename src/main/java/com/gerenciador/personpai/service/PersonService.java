package com.gerenciador.personpai.service;

import com.gerenciador.personpai.dto.MessageResponseDTO;
import com.gerenciador.personpai.entity.Person;
import com.gerenciador.personpai.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person){
        Person savedPerson = personRepository.save(person);
        //System.out.println("adicionado pessoa: " + person);
        
        return MessageResponseDTO
        .builder()
        .message("Created person with ID: " + savedPerson.getId())
        .build();
    }

}
