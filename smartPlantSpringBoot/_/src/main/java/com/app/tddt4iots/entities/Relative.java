package com.app.tddt4iots.entities;

import com.app.tddt4iots.enums.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;
import java.lang.*;

import jakarta.persistence.*;

@Entity
@Table(name = "Relative")
@Data
@NoArgsConstructor
public class Relative {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
    
}    