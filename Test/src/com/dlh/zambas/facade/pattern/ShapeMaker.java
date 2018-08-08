package com.dlh.zambas.facade.pattern;

public class ShapeMaker {
	
	private IShape circle;
	private IShape rectangle;
	private IShape square;
	
	public ShapeMaker(){
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	
	
	public void drawCircle(){
		circle.draw();
	}
	
	
}
