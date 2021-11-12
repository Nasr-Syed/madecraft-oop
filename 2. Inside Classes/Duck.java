public class Duck {
	// member variables: data
	private String name;
	private int lifeExpectancy;
	private String favoriteFood;
	
	public Duck(String name, int lifeExpectancy, String favoriteFood) {
		super();
		this.name = name;
		this.lifeExpectancy = lifeExpectancy;
		this.favoriteFood = favoriteFood;
	}
	// method: functionality
	void waddle() {
		System.out.println(this.name + " is waddling");
	}
	void quack() {
		System.out.println("quackity quack imma give you the smack");
	}
	@Override
	public String toString() {
		return name + favoriteFood;
	}
}
 