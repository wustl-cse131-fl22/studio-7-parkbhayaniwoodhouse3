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
	
	public void Game (int a, int b) {
		game = game + 1;
		assist = a + assist;
		goals = b + goals;
	}
	
	public int Points () {
		return goals + assist;
	}
	
}

