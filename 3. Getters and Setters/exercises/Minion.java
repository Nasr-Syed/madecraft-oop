package exercises;

public class Minion {
	
	private String name; 
	private int eyes; 
	private String color; 
	private String master;
	
	Minion(String name, int eyes, String color, String master){
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}

	/* Getters */
	public String getName() {
		return name;
	}
	
	public int getEyes() {
		return eyes;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getMaster() {
		return master;
	}
	
	
	/* Setters */
	public void setMaster(String master) {
		this.master = master;
	}
	
	
}
