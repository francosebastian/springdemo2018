package com.francosebastian.demo.controller;

import com.francosebastian.demo.domain.Person;
import com.francosebastian.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * A person Rest controller
 */
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    @Transactional(readOnly = true)
    public ResponseEntity getAllPersons() {
        List<Person> persons = personService.getAll();
        if(persons.isEmpty()){
            return new ResponseEntity<Person>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(persons, HttpStatus.OK);
    }

    @GetMapping("/person")
    @Transactional(readOnly = true)
    public ResponseEntity getPerson(@RequestParam Long id){
        Person person = personService.getOne(id);
        if(person == null){
            return new ResponseEntity<Person>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @PutMapping("/person")
    public ResponseEntity updatePerson(@RequestBody Person person){
        personService.update(person);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createPerson(@RequestBody Person person){
        personService.create(person);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity deletePerson(@RequestParam Long id){
        personService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
