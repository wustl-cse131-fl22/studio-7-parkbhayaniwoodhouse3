package studio7;

public class Complex {
	private double a;
	private double b;
	
	public Complex(double x, double y) {
		a = x;
		b = y;
	}
	
	public double ComplexA () {
		return a;
	}
	
	public double ComplexB () {
		return b;
	}
	
	/**
	 * return sum of the two complex numbers
	 * @param another complex number called c
	 * @return sum
	 */
	public Complex add (Complex c) {
		a = this.ComplexA() + c.ComplexA();
		b = this.ComplexB() + c.ComplexB();
		return new Complex(a,b);
	}
	
	/**
	 * return product of the two complex numbers
	 * @param another complex number called c
	 * @return product
	 */
	public Complex multiply (Complex c) {
		a = this.ComplexA() * c.ComplexA() - this.ComplexB() * c.ComplexB();
		b = this.ComplexA() * c.ComplexB() + this.ComplexB() * c.ComplexA();
		return new Complex(a,b);
	}
	
}
