package com.app.tddt4iots.repository;
 
 import com.app.tddt4iots.entities.Person;
 import org.springframework.data.jpa.repository.JpaRepository;
 import java.util.*;
import java.lang.*;

 public interface PersonRepository extends JpaRepository<Person, Long> {
 }
