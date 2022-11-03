package studio7;

public class HockeyPlayer {
	private String name;
	private int jersey;
	private String hand;
	private int game;
	private int assist;
	private int goals;
	
	public HockeyPlayer (String a, int b, String c) {
		name = a;
		jersey = b;
		hand = c;
	}
	
	/**
	 * Add on games, assist, goals 
	 * @param a = number of assist per game
	 * @param b = number of goals per game
	 */
	public void Game (int a, int b) {
		game = game + 1;
		assist = a + assist;
		goals = b + goals;
	}
	
	/**
	 * add goals and assist and return the value 
	 */
	public int Points () {
		return goals + assist;
	}
	
}

