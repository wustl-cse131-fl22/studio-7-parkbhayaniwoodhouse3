package studio7;

public class DIe {
	private int n;
	
	public DIe (int x) {
		n = x;
	}
	
	/**
	 * return value between 1 to n
	 * @return value between 1 to n
	 */
	public int generate () {
		return (int)(Math.random()*n)+1;
	}
}

