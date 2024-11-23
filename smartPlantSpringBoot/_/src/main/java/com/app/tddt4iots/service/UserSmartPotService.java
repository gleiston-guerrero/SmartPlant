package com.app.tddt4iots.service;

import org.springframework.stereotype.Service;
import com.app.tddt4iots.entities.*;
import java.util.*;
import java.lang.*;
import java.io.*;

@Service
public interface UserSmartPotService {     
	 public Notification issueNotification(); 
 
	 public Boolean capturesData(); 
 
	 public Boolean turnOffThePump(Float moistureMaximunLimit); 
 
	 private Boolean thereIsChangeInGasses(Float newCarbonDioxide, Float newAmmonium, Float newAlcohol, Float newToluene); 
 
	 public UserSmartPot sendData(); 
 
	 public Float depositWaterLevelStatus(Float minLevel, Float maxLevel); 
 
	 public void calculateDataEnvironment(); 
 
	 public Float calculateWaterLevel(); 
 
	 public void thereIsChange(Floattemperature humidity, Float soilMoisture); 
 
	 public void calculateConcentrationGases(); 
 
    
}
