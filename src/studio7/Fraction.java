package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction (int x, int y) {
		numerator = x;
		denominator = y;
	}
	
	public int getNum () {
		return numerator;
	}
	
	public int getDenom () {
		return denominator;
	}
	
	/**
	 * return sum of two fractions
	 * @param another fraction f
	 * @return sum
	 */
	public Fraction Add (Fraction f) {
		numerator = this.getNum() * f.getDenom()  + f.getNum() * this.getDenom();
		denominator  = this.getDenom() * f.getDenom();
		return new Fraction(numerator,denominator);
	}
	
	/**
	 * return product of two fractions
	 * @param another fraction f
	 * @return product
	 */
	public Fraction multiply (Fraction f) {
		numerator = this.getNum() * f.getNum() ;
		denominator  = this.getDenom() * f.getDenom();
		return new Fraction (numerator,denominator);
	}
	
	/**
	 * return reciprocal value of a fraction
	 * @return reciprocal 
	 */
	public Fraction reciprocal () {
		return new Fraction (denominator, numerator);
	}
	
	/**
	 * return simplified fraction
	 * @return simplified fraction
	 */
	public Fraction simplify () {
		int a = Math.min(numerator, denominator);	
		for (int i = 1; i<=a; i++) {
			if (numerator % i == 0 && denominator % i==0) {
				numerator = numerator / i;
				denominator = denominator / i;
			}
		}
		return new Fraction(numerator, denominator);
	}
}
