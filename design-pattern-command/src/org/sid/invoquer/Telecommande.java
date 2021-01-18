package org.sid.invoquer;

import java.util.HashMap;
import java.util.Map;

import org.sid.command.Command;

public class Telecommande {
	private Map<String,Command> commandes=new HashMap<String,Command>();
	Command cmd;
	public void addCommand(String ref, Command cmd) {
		commandes.put(ref, cmd);
	}
	public void invoquer(String ref) {
		 cmd=commandes.get(ref);
		if(cmd!=null) cmd.executer();
	}
	public void undo() {
		if(cmd!=null) cmd.undo();
	}
	

}
