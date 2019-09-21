package modelo;

import java.util.ArrayList;

import processing.core.PApplet;

public class Palabra {
	String p;
	String[] l;
	ArrayList<Letra> letrasArray;
	PApplet app;

	public Palabra(String p, PApplet app) {
		this.p = p;
		this.app = app;
		letrasArray = new ArrayList<Letra>();
	}

	public void dividirLetras(String palabra) {
		//Letra n = new Letra(palabra.charAt());
		/*for (int i = 0; i < l.length; i++) {
			p.split("");
		}*/
	}
	
	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}
}