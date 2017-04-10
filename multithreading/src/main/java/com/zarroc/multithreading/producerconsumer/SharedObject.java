package com.zarroc.multithreading.producerconsumer;

public class SharedObject {
	private String message;
	private boolean hasMessagge;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isHasMessagge() {
		return hasMessagge;
	}
	public void setHasMessagge(boolean hasMessagge) {
		this.hasMessagge = hasMessagge;
	}
	
	

}
