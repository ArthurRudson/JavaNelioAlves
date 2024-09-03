package entities;

import entities.enums.Color;

public class CircleAbstrato extends ShapeAbstrato{
	
	private Double radius;

	public CircleAbstrato() {
		super();
	}
	
	
	public CircleAbstrato(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}


	public Double getRadius() {
		return radius;
	}


	public void setRadius(Double radius) {
		this.radius = radius;
	}


	@Override
	public double area() {
		return Math.PI *getRadius() * getRadius();
	}
}
