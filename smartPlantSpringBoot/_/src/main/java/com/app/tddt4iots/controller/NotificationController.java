package com.app.tddt4iots.controller;

import com.app.tddt4iots.entities.Notification;
import com.app.tddt4iots.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    @Autowired
    private NotificationRepository notificationRepository;

    @GetMapping
    public ResponseEntity<List<Notification>> getNotification() {
        List<Notification> listNotification = notificationRepository.findAll();
        return ResponseEntity.ok(listNotification);
    }

    @PostMapping
    public ResponseEntity<Notification> insertNotification(@RequestBody Notification notification) {
        Notification newNotification = notificationRepository.save(notification);
        return ResponseEntity.ok(newNotification);
    }

    @PutMapping
    public ResponseEntity<Notification> updateNotification(@RequestBody Notification notification) {
        Notification upNotification = notificationRepository.save(notification);
        if (upNotification != null) {
            return ResponseEntity.ok(upNotification);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Notification> deletePersons(@PathVariable("id") Long element) {
        notificationRepository.deleteById(element);
        return ResponseEntity.ok(null);
    }

}
