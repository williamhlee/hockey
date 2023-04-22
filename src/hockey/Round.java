package hockey;

public class Round {
	
	private String team;
	private int games;
	
	Round(String t, int g) {
		this.team = t;
		this.games = g;
	}
	
	public String getTeam () {
		return team;
	}

	public int getGames () {
		return games;
	}

}
