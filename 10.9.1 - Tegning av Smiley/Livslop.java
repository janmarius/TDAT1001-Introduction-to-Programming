/**
* Livslop.java
*
* Oppgave 10.9.1
*
* For å kjøre denne må du bruke filen applet.html:
* 1 - Åpne Command Prompt
* 2 - Finn lokasjonen hvor filene ligger (cd kommandoen)
* 3 - Bruk kommandoen "appletviewer applet.html" (applet.html er navnet på .html filen du vil kjøre)
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