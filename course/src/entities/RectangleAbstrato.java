package entities;

import entities.enums.Color;

public class RectangleAbstrato extends ShapeAbstrato {
	
	private Double width;
	private Double height;
	
	public RectangleAbstrato() {
		super();
	}
	

	public RectangleAbstrato(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	

	public Double getWidth() {
		return width;
	}


	public void setWidth(Double width) {
		this.width = width;
	}


	public Double getHeight() {
		return height;
	}


	public void setHeight(Double height) {
		this.height = height;
	}


	@Override
	public double area() {
		return getWidth() * getHeight();
	}

	
}
