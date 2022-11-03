package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	//instance variables
	private double length;
	private double width;
	
	//constructor
	public Rectangle(double initLength, double initWidth) {
		length = initLength;
		width = initWidth;
	}
	
	//method for area
	public double area () {
		double area = this.length * this.width;
		return area;
	}
	
	//method for perimeter
	public double perimeter() {
		double perimeter = 2*(this.length) + 2*(this.width);
		return perimeter;
	}
	
	
	//method for comparing sizes of two rectangles
	public boolean compare (Rectangle r) {
		double r1 = this.area();
		double r2 = r.area();
		if (r1 > r2) {
			return true; //this means that the original object we created has a larger area
		}
		else {
			return false;
		}
		
	}
	
	//method to see if it is a square
	public boolean isItSquare() {
		if (this.length == this.width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//method for rectangle to draw itself
	public void drawRectangle() {
		StdDraw.setPenColor(Color.RED);
		StdDraw.rectangle(0.5, 0.5, (0.5)*this.width, (0.5)*this.length);
	}
	
	//main method
	public static void main (String[] args) {
		Rectangle r1 = new Rectangle(0.5, 0.5);
		Rectangle r2 = new Rectangle (0.3, 0.2);
		System.out.println(r1.area());
		System.out.println(r2.area());
		System.out.println(r1.perimeter());
		System.out.println(r2.perimeter());
		System.out.println(r1.compare(r2));
		System.out.println(r1.isItSquare());
		r1.drawRectangle();
		r2.drawRectangle();
	}

}
