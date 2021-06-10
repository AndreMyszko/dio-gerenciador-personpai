package com.gerenciador.personpai.controller;

import com.gerenciador.personpai.dto.MessageResponseDTO;
import com.gerenciador.personpai.entity.Person;
import com.gerenciador.personpai.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
    
    private PersonRepository personRepository;
    
    @Autowired
    public PersonController(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody Person person){
        Person savedPerson = personRepository.save(person);
        //System.out.println("adicionado pessoa: " + person);
        
        return MessageResponseDTO
        .builder()
        .message("Created person with ID: " + savedPerson.getId())
        .build();
    }

    // @GetMapping
    // public String getBook() {
    //     return "Hello World! Api Test OK";
    // }
}
