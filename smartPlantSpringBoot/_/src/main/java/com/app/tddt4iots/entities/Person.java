package com.app.tddt4iots.entities;

import com.app.tddt4iots.enums.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;
import java.lang.*;

import jakarta.persistence.*;
import java.util.Date; 

@Entity
@Table(name = "Person")
@Data
@NoArgsConstructor
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
    @Column(name = "name", nullable = true, unique = true, length = 30) 
    private String name; 
 
    @Column(name = "surname", nullable = false, unique = false, length = 30) 
    private String surname; 
 
    @Column(name = "identyCard", nullable = false, unique = false, length = 30) 
    private String identyCard; 
 
    @Column(name = "telephone", nullable = false, unique = false, length = 30) 
    private String telephone; 
 
    @Column(name = "address", nullable = false, unique = false, length = 30) 
    private String address; 
 
    @Column(name = "dateOfBirth", nullable = false, unique = false) 
    @Temporal(TemporalType.TIMESTAMP) 
    private Date dateOfBirth; 
 
    @Column(name = "email", nullable = false, unique = false, length = 30) 
    private String email; 
 
    
}    
