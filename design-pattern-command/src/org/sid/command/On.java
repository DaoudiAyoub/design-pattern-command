package org.sid.command;

import org.sid.receiver.Receiver;

public class On implements Command {
	private Receiver receiver;
	public On(Receiver receiver) {
		this.receiver=receiver;
	}

	@Override
	public void executer() {
		receiver.On();
		
	}

	@Override
	public void undo() {
		receiver.off();

	}
	

}
