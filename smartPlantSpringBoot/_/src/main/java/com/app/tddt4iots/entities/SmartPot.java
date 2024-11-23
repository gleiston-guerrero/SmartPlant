package com.app.tddt4iots.entities;

import com.app.tddt4iots.enums.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;
import java.lang.*;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "SmartPot")
@Data
@NoArgsConstructor
public class SmartPot {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
    @Column(name = "MACAddress", nullable = true, unique = true, length = 30) 
    private String MACAddress; 
 
    @Column(name = "name", nullable = false, unique = false, length = 30) 
    private String name; 
 
    @OneToMany(mappedBy = "id") 
    private List<UserSmartPot> userSmartPot; 
 
    @JoinColumn(name = "idPlant", referencedColumnName = "id") 
    @OneToOne 
    private Plant plant; 
 
    
}    
