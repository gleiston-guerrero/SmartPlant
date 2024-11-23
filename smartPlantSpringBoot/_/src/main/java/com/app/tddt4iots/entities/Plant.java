package com.app.tddt4iots.entities;

import com.app.tddt4iots.enums.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;
import java.lang.*;

import jakarta.persistence.*;

@Entity
@Table(name = "Plant")
@Data
@NoArgsConstructor
public class Plant {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
    @Column(name = "commonName", nullable = true, unique = true, length = 30) 
    private String commonName; 
 
    @Column(name = "scientificName", nullable = false, unique = false, length = 30) 
    private String scientificName; 
 
    @Column(name = "image", nullable = false, unique = false) 
    private Array<String> image; 
 
    @Column(name = "family", nullable = false, unique = false, length = 30) 
    private String family; 
 
    @Column(name = "kingdom", nullable = false, unique = false, length = 30) 
    private String kingdom; 
 
    @JoinColumn(name = "idSmartPot", referencedColumnName = "id") 
    @OneToOne 
    private SmartPot smartPot; 
 
    
}    
