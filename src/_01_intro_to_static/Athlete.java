package _01_intro_to_static;



	public class Athlete {

	    static int nextBibNumber;

	    static String raceLocation = "New York";

	    static String raceStartTime = "9.00am";



	    String name;

	    int speed;

	    int bibNumber;



	    Athlete (String name, int speed){

	        this.name = name;

	        this.speed = speed;

	        bibNumber = nextBibNumber; 

	        nextBibNumber++;

	    }



	    public static void main(String[] args) {

	        //create two athletes

	    	Athlete bob = new Athlete("bob", 6);

	    	Athlete jim = new Athlete("jim", 8);

	    	Athlete wlb = new Athlete("wlb", 10);

	        //print their names, bibNumbers, and the location of their race. 

	    	

	    	System.out.println(bob.name);

	    	System.out.println(bob.bibNumber);

	    	System.out.println(bob.raceLocation);

	    	

	    	System.out.println(jim.name);

	    	System.out.println(jim.bibNumber);

	    	System.out.println(jim.raceLocation);

	    	

	    	Athlete.raceLocation = "Kansas City";

	    	

	    	System.out.println(wlb.name);

	    	System.out.println(wlb.bibNumber);

	    	System.out.println(wlb.raceLocation);   	

	    }

	}





