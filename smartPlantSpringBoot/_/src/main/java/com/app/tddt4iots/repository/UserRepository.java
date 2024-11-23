package com.app.tddt4iots.repository;
 
 import com.app.tddt4iots.entities.User;
 import org.springframework.data.jpa.repository.JpaRepository;
 import java.util.*;
import java.lang.*;

 public interface UserRepository extends JpaRepository<User, Long> {
 }
