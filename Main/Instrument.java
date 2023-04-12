package Main;

import java.awt.Color;

public class Instrument {
	
	private Color color;
	
	private int value; 
	
	private String name;
	
	public Instrument(Color c, int v, String n) {
		color = c;
		value = v; 
		name = n;
	}
	
	public Color getColor() {
		return color;
	}
	public int getValue() {
		return value;
	}
	public String getName() {
		return name;
	}
}
