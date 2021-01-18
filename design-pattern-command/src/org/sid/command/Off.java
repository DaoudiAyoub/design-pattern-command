package org.sid.command;

import org.sid.receiver.Receiver;

public class Off implements Command {
	private Receiver receiver;
	
	public Off(Receiver receiver) {
		this.receiver=receiver;
	}

	@Override
	public void executer() {
		// TODO Auto-generated method stub
		receiver.off();
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		receiver.On();
	}
	

}
