package oca;

public class InstanceInitializerBlocks {
	
	private String name = "Fluffy";
	protected static String raceType = "Best";
	{System.out.println("Setting fields");}
	{System.out.println("Race Type: " + raceType);}
	
	public InstanceInitializerBlocks() {
		name = "Groovy";
		raceType = "Good";
		System.out.println("Setting constructor");
	}

	public static void main(String[] args) {

		InstanceInitializerBlocks iib = new InstanceInitializerBlocks();
		
		System.out.println("Neme: " + iib.name);
		System.out.println("Race Type: " + iib.raceType);
		System.out.println("Race Type: " + raceType);  // We can not call 'name' like this as 'name' is not static 

	}
	
	public static void setRaceType(String raceType) {
		InstanceInitializerBlocks.raceType = raceType;
		System.out.println("Race Type is now: " + raceType);
	}
	
	{setRaceType("Okay");}
	{System.out.println("Race Type: " + raceType);}
	{System.out.println("Neme: " + name);}

}
