/**
* Livslop.java
*
* Oppgave 10.9.1
*
* For � kj�re denne m� du bruke filen applet.html:
* 1 - �pne Command Prompt
* 2 - Finn lokasjonen hvor filene ligger (cd kommandoen)
* 3 - Bruk kommandoen "appletviewer applet.html" (applet.html er navnet p� .html filen du vil kj�re)
*/


import javax.swing.JApplet;

public class Livslop extends JApplet {
	public void init() {
		add(new Tegning());
		System.out.println("Appleten er lastet inn i nettleseren.");
	}

	public void start() {
		System.out.println("Appleten starter.");
	}

	public void stop() {
		System.out.println("Appleten stopper.");
	}

	public void destroy() {
		System.out.println("Appleten avslutter");
	}

}