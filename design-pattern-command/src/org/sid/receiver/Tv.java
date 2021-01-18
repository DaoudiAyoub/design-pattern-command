package org.sid.receiver;

public class Tv implements Receiver {

	@Override
	public void On() {
		// TODO Auto-generated method stub
		System.out.println("Tv is on");
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Tv is off");
	}

}
