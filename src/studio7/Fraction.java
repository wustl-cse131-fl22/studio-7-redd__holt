package studio7;

public class Fraction {
	
	//instance variables
	private int numerator;
	private int denominator;
	
	//constructor
	public Fraction (int initNumerator, int initDenominator) {
		numerator = initNumerator;
		denominator = initDenominator;
	}
	
	//method to add fractions together
	public String add(Fraction b) {
		//numerator: (denominator of second fraction * numerator of first fraction) + 
		// (denominator of first fraction * numerator of second fraction)
		int sumNumerator = (b.denominator * this.numerator) + (this.denominator * b.numerator);
		int sumDenominator = this.denominator*b.denominator;
		
		//denominator (denominator of first * denominator of second)
		return sumNumerator + "/" + sumDenominator;
	}
	
	//method to multiply
	public String multiply (Fraction b) {
		int multiplyNumerator = b.numerator*this.numerator;
		int multiplyDenominator = b.denominator*this.denominator;
		return multiplyNumerator + "/" + multiplyDenominator;
	}
	
	//method for reciprocal
	public String reciprocal() {
		return denominator + "/" + numerator;
	}
	
	//main method
	public static void main (String[] args) {
		Fraction a = new Fraction(1, 2);
		Fraction b = new Fraction(3,5);
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
		System.out.println(a.reciprocal());
	}
	

}
