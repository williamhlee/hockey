package hockey;

public class Pick {

//	private String name;
	private String team;
	private int games;
	private boolean fromPicks = false;
	private int value;

	public Pick(String t, int g, boolean f, int v) {
		this.team = t;
		this.games = g;
		this.fromPicks = f;
		this.value = v;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getGames() {
		return games;
	}

	public void setGames(int games) {
		this.games = games;
	}

	public boolean getFromPicks() {
		return fromPicks;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "team=" + team + " in # of games=" + games;
	}

}
