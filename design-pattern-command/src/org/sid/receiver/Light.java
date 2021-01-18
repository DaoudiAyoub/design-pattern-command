package org.sid.receiver;

public class Light implements Receiver {

	@Override
	public void On() {
		System.out.println("Light is on");
		
	}

	@Override
	public void off() {
		System.out.println("Light is off");
		
	}

}
