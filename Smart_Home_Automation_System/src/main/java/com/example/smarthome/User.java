package com.example.smarthome;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	private String name = "Indu";
	private String homeId = "Home-12/3";
	
	
	public String getName() {
		return name;
	}
	public String getHomeId() {
		return homeId;
	}
	
	
}
