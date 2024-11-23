package com.app.tddt4iots.service.impl;

import com.app.tddt4iots.service.*;
import com.app.tddt4iots.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.tddt4iots.entities.*;
import java.util.*;
import java.lang.*;
import java.io.*;

@Service
public class UserSmartPotServiceImpl implements UserSmartPotService {     
    @Autowired
    UserSmartPotRepository userSmartPotRepository;
    
	@Override 
	public Notification issueNotification() { 
	 	// Inside this block you can enter your code implementing the business logic you need. 
	 	Notification response = null; 
	 	return response; 
	 } 
	@Override 
	public Boolean capturesData() { 
	 	// Inside this block you can enter your code implementing the business logic you need. 
	 	Boolean response = null; 
	 	return response; 
	 } 
	@Override 
	public Boolean turnOffThePump(Float moistureMaximunLimit) { 
	 	// Inside this block you can enter your code implementing the business logic you need. 
	 	Boolean response = null; 
	 	return response; 
	 } 
	@Override 
	private Boolean thereIsChangeInGasses(Float newCarbonDioxide, Float newAmmonium, Float newAlcohol, Float newToluene) { 
	 	// Inside this block you can enter your code implementing the business logic you need. 
	 	Boolean response = null; 
	 	return response; 
	 } 
	@Override 
	public UserSmartPot sendData() { 
	 	// Inside this block you can enter your code implementing the business logic you need. 
	 	UserSmartPot response = null; 
	 	return response; 
	 } 
	@Override 
	public Float depositWaterLevelStatus(Float minLevel, Float maxLevel) { 
	 	// Inside this block you can enter your code implementing the business logic you need. 
	 	Float response = null; 
	 	return response; 
	 } 
	@Override 
	public void calculateDataEnvironment() { 
	 	// Inside this block you can enter your code implementing the business logic you need. 
	} 
	@Override 
	public Float calculateWaterLevel() { 
	 	// Inside this block you can enter your code implementing the business logic you need. 
	 	Float response = null; 
	 	return response; 
	 } 
	@Override 
	public void thereIsChange(Floattemperature humidity, Float soilMoisture) { 
	 	// Inside this block you can enter your code implementing the business logic you need. 
	} 
	@Override 
	public void calculateConcentrationGases() { 
	 	// Inside this block you can enter your code implementing the business logic you need. 
	} 
    
}
