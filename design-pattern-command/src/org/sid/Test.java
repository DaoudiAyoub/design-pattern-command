package org.sid;

import java.util.Scanner;

import org.sid.command.Command;
import org.sid.command.Off;
import org.sid.command.On;
import org.sid.invoquer.Telecommande;
import org.sid.receiver.Light;
import org.sid.receiver.Radio;
import org.sid.receiver.Receiver;
import org.sid.receiver.Tv;

public class Test {
public static void main(String[] args) {
	Receiver tv=new Tv();
	Receiver light=new Light();
	Receiver radio=new Radio();
	
	Command cmd1=new On(tv);
	Command cmd2=new On(light);
	Command cmd3=new On(radio);
	Command cmd4=new Off(tv);
	Command cmd5=new Off(light);
	Command cmd6=new Off(radio);
	
	Telecommande remote=new Telecommande();
	remote.addCommand("tvon", cmd1);
	remote.addCommand("lighton", cmd2);
	remote.addCommand("radioon", cmd3);
	remote.addCommand("tvoff", cmd4);
	remote.addCommand("lightoff", cmd5);
	remote.addCommand("radiooff", cmd6);
	
	Scanner sc=new Scanner(System.in);
	System.out.println("*************************************");
	System.out.println("Tv on - 1");
	System.out.println("light on - 2");
	System.out.println("radio on - 3");
	System.out.println("Tv off - 4");
	System.out.println("light off -5");
	System.out.println("radio off - 6");
	System.out.println("undo - 7");
	 
	int choix;
	do {
	choix=sc.nextInt();
	switch(choix) {
	case 1 : remote.invoquer("tvon"); break;
	case 2 : remote.invoquer("lighton"); break;
	case 3 : remote.invoquer("radioon"); break;
	case 4 : remote.invoquer("tvoff"); break;
	case 5 : remote.invoquer("lightoff"); break;
	case 6 : remote.invoquer("radiooff"); break;
	case 7 : remote.undo();
	}}while(choix!=0);
	
	
	}
	
	
	
	
	
	
	
}

