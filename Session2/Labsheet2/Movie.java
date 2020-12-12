public class Movie {
	// declare instance variables
	String name;
	int year;
	float rating;
	// declare class/static variable
	static float avg_rating;
	
	Movie(String n, int y, float r) {
		this.name = n;
		this.year = y;
		this.rating = r;
	}
	
	void displayDetails() {
		System.out.println("Name of the Movie: "+name);
		System.out.println("Year of release: "+year);
		System.out.println("Rating: "+rating);
		System.out.println("Average Rating: "+avg_rating+"\n");
	}
	
	public static void main(String[] args) {
		// create instances/objects of Movie type and pass the values as arguments
		Movie movie1 = new Movie("The Shawshank Redemption", 1994, 9.3f);
		Movie movie2 = new Movie("The Godfather", 1972, 9.2f);
		Movie movie3 = new Movie("The Dark Knight", 2008, 9.0f);
		
		// calculate the average rating 
		float avg = (movie1.rating + movie2.rating + movie3.rating)/3;
		
		// assign the calculated output to the class variable
		// we can access class variables using the class name
		Movie.avg_rating = avg;
		
		// call displayDetails method to print all details of each movie instance
		movie1.displayDetails();
		movie2.displayDetails();
		movie3.displayDetails();
		
		// create a new reference to the instance movie1
		Movie movie4 = movie1;
		
		// assign the values for movie4 instance using the dot operator
		movie4.name = "The Return of the King";
		movie4.year = 2003;
		movie4.rating = 8.9f;
		
		System.out.println("--- After assigning the values to the newly created 'movie1' reference (movie4) ---");
		// call displayDetails method
		movie1.displayDetails();	
	}
}
