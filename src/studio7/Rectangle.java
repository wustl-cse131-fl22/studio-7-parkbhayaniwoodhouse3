package studio7;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double x, double y) {
		length = x;
		width = y;
	}
	
	public double Area () {
		return length * width;
		
	}
	
	/**
	 * return the area of rectangle is smaller than another rectangle
	 * @param another rectangle r
	 * @return boolean
	 */
	public boolean isSmaller (Rectangle r) {
		boolean smaller = false;
		if (r.Area() > this.Area()) {
			smaller = true;
		}
		return smaller;
	}
	
	/**
	 * return if the rectangle is square
	 * @return if the rectangle is square
	 */
	public boolean isSquare () {
		if (length == width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * return perimeter
	 * @return perimeter
	 */
	public double perimeter () {
		return 2 * (length + width);
	}
	
	
}

