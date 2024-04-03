package abstractclassesandmethods.movie;

public abstract class Movie {

	private String title;
	
	public Movie(String title) {
        this.title = title;
    }
	
	public String getTitle() {
		return title;
	}
	
	public abstract void displayInfo();

	public abstract void ratingInfo();
}

