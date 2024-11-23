package com.app.tddt4iots.repository;
 
 import com.app.tddt4iots.entities.Notification;
 import org.springframework.data.jpa.repository.JpaRepository;
 import java.util.*;
import java.lang.*;

 public interface NotificationRepository extends JpaRepository<Notification, Long> {
 }
