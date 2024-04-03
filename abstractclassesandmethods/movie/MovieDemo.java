package abstractclassesandmethods.movie;

public class MovieDemo {

	public static void main(String[] args) {

		Movie romComMovie = new RomComMovie("Movie 1", "xyz");
        Movie thrillerMovie = new ThrillerMovie("Movie 2", "xyz");

        System.out.println("RomCom Movie Details:");
        romComMovie.displayInfo();
        romComMovie.ratingInfo();
        System.out.println();

        System.out.println("Thriller Movie Details:");
        thrillerMovie.displayInfo();
        thrillerMovie.ratingInfo();
        
	}
}
