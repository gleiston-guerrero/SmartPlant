package com.app.tddt4iots.controller;

import com.app.tddt4iots.entities.Person;
import com.app.tddt4iots.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public ResponseEntity<List<Person>> getPerson() {
        List<Person> listPerson = personRepository.findAll();
        return ResponseEntity.ok(listPerson);
    }

    @PostMapping
    public ResponseEntity<Person> insertPerson(@RequestBody Person person) {
        Person newPerson = personRepository.save(person);
        return ResponseEntity.ok(newPerson);
    }

    @PutMapping
    public ResponseEntity<Person> updatePerson(@RequestBody Person person) {
        Person upPerson = personRepository.save(person);
        if (upPerson != null) {
            return ResponseEntity.ok(upPerson);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Person> deletePersons(@PathVariable("id") Long name) {
        personRepository.deleteById(name);
        return ResponseEntity.ok(null);
    }

}
