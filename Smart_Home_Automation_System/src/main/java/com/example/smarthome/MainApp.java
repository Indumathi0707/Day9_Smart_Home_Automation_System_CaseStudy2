package com.example.smarthome;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AutomationService automationService = context.getBean(AutomationService.class);
		
		automationService.controlDevice(true);
		automationService.controlDevice(false);
	}

}
