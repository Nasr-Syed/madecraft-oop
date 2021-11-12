
public class Pond {
	public static void main(String[] args) {
		String me = "Nasr";
		//<type> <name> = new <type>()
		Duck mobyDuck = new Duck("Moby", 90/3, "celery");
		Duck smallDuck = new Duck("Smol", 20, "beesechurgers");
		
		mobyDuck.waddle();
		smallDuck.quack();
		System.out.println(mobyDuck);
	}
}
 