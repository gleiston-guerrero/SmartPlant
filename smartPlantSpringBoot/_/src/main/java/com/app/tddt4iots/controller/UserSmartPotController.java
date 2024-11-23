package com.app.tddt4iots.controller;

import com.app.tddt4iots.entities.UserSmartPot;
import com.app.tddt4iots.repository.UserSmartPotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usersmartpot")
public class UserSmartPotController {

    @Autowired
    private UserSmartPotRepository usersmartpotRepository;

    @GetMapping
    public ResponseEntity<List<UserSmartPot>> getUserSmartPot() {
        List<UserSmartPot> listUserSmartPot = usersmartpotRepository.findAll();
        return ResponseEntity.ok(listUserSmartPot);
    }

    @PostMapping
    public ResponseEntity<UserSmartPot> insertUserSmartPot(@RequestBody UserSmartPot usersmartpot) {
        UserSmartPot newUserSmartPot = usersmartpotRepository.save(usersmartpot);
        return ResponseEntity.ok(newUserSmartPot);
    }

    @PutMapping
    public ResponseEntity<UserSmartPot> updateUserSmartPot(@RequestBody UserSmartPot usersmartpot) {
        UserSmartPot upUserSmartPot = usersmartpotRepository.save(usersmartpot);
        if (upUserSmartPot != null) {
            return ResponseEntity.ok(upUserSmartPot);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<UserSmartPot> deletePersons(@PathVariable("id") Long depositWaterLevel) {
        usersmartpotRepository.deleteById(depositWaterLevel);
        return ResponseEntity.ok(null);
    }

}
