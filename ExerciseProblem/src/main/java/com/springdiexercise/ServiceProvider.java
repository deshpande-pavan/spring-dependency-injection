package com.springdiexercise;

public class ServiceProvider {

	private Service service;

	public void setService(Service service) {
		this.service = service;
	}
	
	public void getService() {
		service.getServiceName();
	}
}
