package com.app.tddt4iots.controller;

import com.app.tddt4iots.entities.Plant;
import com.app.tddt4iots.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/plant")
public class PlantController {

    @Autowired
    private PlantRepository plantRepository;

    @GetMapping
    public ResponseEntity<List<Plant>> getPlant() {
        List<Plant> listPlant = plantRepository.findAll();
        return ResponseEntity.ok(listPlant);
    }

    @PostMapping
    public ResponseEntity<Plant> insertPlant(@RequestBody Plant plant) {
        Plant newPlant = plantRepository.save(plant);
        return ResponseEntity.ok(newPlant);
    }

    @PutMapping
    public ResponseEntity<Plant> updatePlant(@RequestBody Plant plant) {
        Plant upPlant = plantRepository.save(plant);
        if (upPlant != null) {
            return ResponseEntity.ok(upPlant);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Plant> deletePersons(@PathVariable("id") Long commonName) {
        plantRepository.deleteById(commonName);
        return ResponseEntity.ok(null);
    }

}
