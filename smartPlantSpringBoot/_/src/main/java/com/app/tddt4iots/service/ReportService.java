package com.app.tddt4iots.service;

import org.springframework.stereotype.Service;
import com.app.tddt4iots.entities.*;
import java.util.*;
import java.lang.*;
import java.io.*;

@Service
public interface ReportService {     
	 public void historicalReport(Date beginDate, Date endDate); 
 
	 public void realTimeData(UserSmartPot userSmartPot); 
 
    
}
