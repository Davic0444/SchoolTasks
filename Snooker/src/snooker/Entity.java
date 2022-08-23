package snooker;

public class Entity {
	
	private Integer position;
	private String name;
	private String country;
	private Integer award;
	
	public Entity(Integer position, String name, String country, Integer award) {
		super();
		this.position = position;
		this.name = name;
		this.country = country;
		this.award = award;
	}
	public Integer getPosition() {
		return position;
	}
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public Integer getAward() {
		return award;
	}
	
	@Override
	public String toString() {
		return "Entity [position=" + position + ", name=" + name + ", country=" + country + ", award=" + award + "]";
	}	
	
}
