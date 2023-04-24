package com.springFramework.springframework.Cdi;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
public class BusinessService {
private  DataService dataService;

@Inject
public void setDataService(DataService dataService) {
	System.out.println("setter injection");
	this.dataService = dataService;
}

public DataService getDataService() {
	return dataService;
}


}
