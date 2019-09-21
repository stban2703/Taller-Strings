package vista;

import java.util.ArrayList;

import modelo.Palabra;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}

	ArrayList<String> guardarArray;
	ArrayList<Palabra> palabrasArray;
	String[] textLoaded;
	String[] textSplit;

	public void settings() {
		size(1000, 800);
	}

	public void setup() {
		textLoaded = loadStrings("words.txt");
		guardarArray = new ArrayList<String>();
		palabrasArray = new ArrayList<Palabra>();
		for (int i = 0; i < textLoaded.length; i++) {
			guardarArray.add(textLoaded[i]);
		}

		for (int i = 0; i < guardarArray.size(); i++) {
			palabrasArray.add(new Palabra(guardarArray.get(i), this));
		}
	}

	public void draw() {
		background(255);
		fill(0);
		textSize(20);

		for (int i = 0; i < palabrasArray.size(); i++) {
			//palabrasArray.get(i).splitText();
			text(palabrasArray.get(i).getP(), 100, 15 + i * 20);
		}
	}

	public void mousePressed() {

	}
}