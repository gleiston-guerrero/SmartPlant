package com.app.tddt4iots.controller;

import com.app.tddt4iots.entities.SmartPot;
import com.app.tddt4iots.repository.SmartPotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/smartpot")
public class SmartPotController {

    @Autowired
    private SmartPotRepository smartpotRepository;

    @GetMapping
    public ResponseEntity<List<SmartPot>> getSmartPot() {
        List<SmartPot> listSmartPot = smartpotRepository.findAll();
        return ResponseEntity.ok(listSmartPot);
    }

    @PostMapping
    public ResponseEntity<SmartPot> insertSmartPot(@RequestBody SmartPot smartpot) {
        SmartPot newSmartPot = smartpotRepository.save(smartpot);
        return ResponseEntity.ok(newSmartPot);
    }

    @PutMapping
    public ResponseEntity<SmartPot> updateSmartPot(@RequestBody SmartPot smartpot) {
        SmartPot upSmartPot = smartpotRepository.save(smartpot);
        if (upSmartPot != null) {
            return ResponseEntity.ok(upSmartPot);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<SmartPot> deletePersons(@PathVariable("id") Long MACAddress) {
        smartpotRepository.deleteById(MACAddress);
        return ResponseEntity.ok(null);
    }

}
