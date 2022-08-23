package fifa;

public class Entity {
	
	private String team;
	private Integer position;
	private Integer changes;
	private Integer score;
	
	public Entity(String team, Integer position, Integer changes, Integer score) {
		super();
		this.team = team;
		this.position = position;
		this.changes = changes;
		this.score = score;
	}
	
	public String getTeam() {
		return team;
	}
	
	public Integer getPosition() {
		return position;
	}
	
	public Integer getChanges() {
		return changes;
	}
	
	public Integer getScore() {
		return score;
	}
	
	@Override
	public String toString() {
		return "Entity [team=" + team + ", position=" + position + ", changes=" + changes + ", score=" + score + "]";
	}
	
	
	
}
