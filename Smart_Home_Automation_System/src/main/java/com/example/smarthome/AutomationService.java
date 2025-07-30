package com.example.smarthome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutomationService {
	
	@Autowired
	private User user;
	
	@Autowired
	private Device device;
	
	public void controlDevice(boolean turnOn) {
		System.out.println("User: " + user.getName() + " (" + user.getHomeId() + ")");
        if (turnOn) {
            device.turnOn();
        } else {
            device.turnOff();
        }
	}
}
