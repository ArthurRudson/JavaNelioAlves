package entities;

import entities.enums.Color;

public abstract class ShapeAbstrato {

	private Color color;
	
	public ShapeAbstrato() {
	}
	 
	public ShapeAbstrato(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();
}
