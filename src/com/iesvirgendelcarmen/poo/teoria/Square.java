package com.iesvirgendelcarmen.poo.teoria;

public class Square {
	private int side;

	
	public Square() {
		this.side = 5;
	}
	
	public Square(int side) {
		this.side = side;
	}
	
	public Square(int side1, int side2) {
		this.side = side1 + side2;
	} 

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
	
	
}
