package com.francosebastian.demo.service;

import com.francosebastian.demo.domain.Person;
import com.francosebastian.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public Person getOne(Long id){
        return this.personRepository.getOne(id);
    }

    public List<Person> getAll(){
        return this.personRepository.findAll();
    }

    public void update(Person person){
        this.personRepository.save(person);
    }

    public void create(Person person){
        this.personRepository.save(person);

    }

    public void delete(Long id){
        this.personRepository.delete(id);
    }
}
