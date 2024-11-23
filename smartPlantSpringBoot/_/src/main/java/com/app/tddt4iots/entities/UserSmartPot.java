package com.app.tddt4iots.entities;

import com.app.tddt4iots.enums.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;
import java.lang.*;

import jakarta.persistence.*;
import java.util.Date; 

@Entity
@Table(name = "UserSmartPot")
@Data
@NoArgsConstructor
public class UserSmartPot {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
    @Column(name = "depositWaterLevel", nullable = true, unique = true, length = 30) 
    private String depositWaterLevel; 
 
    @Column(name = "dateRegister", nullable = false, unique = false) 
    @Temporal(TemporalType.TIMESTAMP) 
    private Date dateRegister; 
 
    @Column(name = "humidity", nullable = false, unique = false) 
    private Float humidity; 
 
    @Column(name = "temperature", nullable = false, unique = false) 
    private Float temperature; 
 
    @Column(name = "lightIntensity", nullable = false, unique = false) 
    private Float lightIntensity; 
 
    @Column(name = "soilMoisture", nullable = false, unique = false) 
    private Float soilMoisture; 
 
    @Column(name = "carbonDioxide", nullable = false, unique = false) 
    private Float carbonDioxide; 
 
    @Column(name = "ammonium", nullable = false, unique = false) 
    private Float ammonium; 
 
    @Column(name = "alcohol", nullable = false, unique = false) 
    private Float alcohol; 
 
    @Column(name = "toluene", nullable = false, unique = false) 
    private Float toluene; 
 
    @JoinColumn(name = "idUser", referencedColumnName = "id") 
    @ManyToOne 
    private User user; 
 
    @JoinColumn(name = "idSmartPot", referencedColumnName = "id") 
    @ManyToOne 
    private SmartPot smartPot; 
 
    
}    
