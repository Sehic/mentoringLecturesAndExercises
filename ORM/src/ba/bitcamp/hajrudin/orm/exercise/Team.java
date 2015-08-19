package ba.bitcamp.hajrudin.orm.exercise;

public class Team {
	private Integer id;
	private String name;
	private Integer wins;
	private Integer loses;
	private Integer points;
	private Integer scoredPlus;
	private Integer scoredMinus;
	private String fromGroup;

	public Team(Integer id, String name, Integer wins, Integer loses,
			Integer points, Integer scorePlus, Integer scoreMinus,
			String fromGroup) {
		super();
		this.id = id;
		this.name = name;
		this.wins = wins;
		this.loses = loses;
		this.points = points;
		this.scoredPlus = scorePlus;
		this.scoredMinus = scoreMinus;
		this.fromGroup = fromGroup;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getWins() {
		return wins;
	}

	public void setWins(Integer wins) {
		this.wins = wins;
	}

	public Integer getLoses() {
		return loses;
	}

	public void setLoses(Integer loses) {
		this.loses = loses;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Integer getScorePlus() {
		return scoredPlus;
	}

	public void setScorePlus(Integer scorePlus) {
		this.scoredPlus = scorePlus;
	}

	public Integer getScoreMinus() {
		return scoredMinus;
	}

	public void setScoreMinus(Integer scoreMinus) {
		this.scoredMinus = scoreMinus;
	}

	public String getFromGroup() {
		return fromGroup;
	}

	public void setFromGroup(String fromGroup) {
		this.fromGroup = fromGroup;
	}

	@Override
	public String toString() {
		return id + " Team: " + name + " Won: " + wins + " Lost: " + loses
				+ " Points: " + points + " Scored: " + scoredPlus
				+ " Scored minus: " + scoredMinus + " Group: " + fromGroup + "\n";
	}

}
