package abstractclassesandmethods.movie;

public class ThrillerMovie extends Movie {

	private String director;
	 
    public ThrillerMovie(String title, String director) {
		super(title);
		this.director = director;
	}
    
    @Override
    public void displayInfo() {
    	System.out.println("Title: " + getTitle());
        System.out.println("Director: " + director);
    }
    
    public void ratingInfo() {
    	System.out.println("Rating "+ (5.3));
	}
}
