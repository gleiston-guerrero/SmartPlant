package com.app.tddt4iots.repository;
 
 import com.app.tddt4iots.entities.Plant;
 import org.springframework.data.jpa.repository.JpaRepository;
 import java.util.*;
import java.lang.*;

 public interface PlantRepository extends JpaRepository<Plant, Long> {
 }
