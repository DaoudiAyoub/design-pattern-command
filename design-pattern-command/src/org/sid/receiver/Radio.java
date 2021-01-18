package org.sid.receiver;

public class Radio implements Receiver {

	@Override
	public void On() {
		System.out.println("Radio is on");
		
	}

	@Override
	public void off() {
		System.out.println("Radio is off");
		
	}

}
