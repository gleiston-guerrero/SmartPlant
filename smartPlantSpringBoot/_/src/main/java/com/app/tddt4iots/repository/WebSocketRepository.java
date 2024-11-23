package com.app.tddt4iots.repository;
 
 import com.app.tddt4iots.entities.WebSocket;
 import org.springframework.data.jpa.repository.JpaRepository;
 import java.util.*;
import java.lang.*;

 public interface WebSocketRepository extends JpaRepository<WebSocket, Long> {
 }
