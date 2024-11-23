package com.app.tddt4iots.entities;

import com.app.tddt4iots.enums.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;
import java.lang.*;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "User")
@Data
@NoArgsConstructor
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
    @Column(name = "nombreDeUsuario", nullable = true, unique = true, length = 30) 
    private String nombreDeUsuario; 
 
    @Column(name = "clave", nullable = false, unique = false, length = 30) 
    private String clave; 
 
    @OneToMany(mappedBy = "id") 
    private List<UserSmartPot> userSmartPot; 
 
    
}    
