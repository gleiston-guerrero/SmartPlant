package com.app.tddt4iots.controller;

import com.app.tddt4iots.entities.WebSocket;
import com.app.tddt4iots.repository.WebSocketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/websocket")
public class WebSocketController {

    @Autowired
    private WebSocketRepository websocketRepository;

    @GetMapping
    public ResponseEntity<List<WebSocket>> getWebSocket() {
        List<WebSocket> listWebSocket = websocketRepository.findAll();
        return ResponseEntity.ok(listWebSocket);
    }

    @PostMapping
    public ResponseEntity<WebSocket> insertWebSocket(@RequestBody WebSocket websocket) {
        WebSocket newWebSocket = websocketRepository.save(websocket);
        return ResponseEntity.ok(newWebSocket);
    }

    @PutMapping
    public ResponseEntity<WebSocket> updateWebSocket(@RequestBody WebSocket websocket) {
        WebSocket upWebSocket = websocketRepository.save(websocket);
        if (upWebSocket != null) {
            return ResponseEntity.ok(upWebSocket);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<WebSocket> deletePersons(@PathVariable("id") Long id) {
        websocketRepository.deleteById(id);
        return ResponseEntity.ok(null);
    }

}
