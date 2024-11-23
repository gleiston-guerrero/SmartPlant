package com.app.tddt4iots.controller;

import com.app.tddt4iots.entities.Relative;
import com.app.tddt4iots.repository.RelativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/relative")
public class RelativeController {

    @Autowired
    private RelativeRepository relativeRepository;

    @GetMapping
    public ResponseEntity<List<Relative>> getRelative() {
        List<Relative> listRelative = relativeRepository.findAll();
        return ResponseEntity.ok(listRelative);
    }

    @PostMapping
    public ResponseEntity<Relative> insertRelative(@RequestBody Relative relative) {
        Relative newRelative = relativeRepository.save(relative);
        return ResponseEntity.ok(newRelative);
    }

    @PutMapping
    public ResponseEntity<Relative> updateRelative(@RequestBody Relative relative) {
        Relative upRelative = relativeRepository.save(relative);
        if (upRelative != null) {
            return ResponseEntity.ok(upRelative);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Relative> deletePersons(@PathVariable("id") Long id) {
        relativeRepository.deleteById(id);
        return ResponseEntity.ok(null);
    }

}
