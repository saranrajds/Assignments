package abstractclassesandmethods.movie;

public class RomComMovie extends Movie {

    private String leadActress;
    
	public RomComMovie(String title, String leadActress) {
		super(title);
		this.leadActress = leadActress;
	}
	
	@Override
    public void displayInfo() {
		System.out.println("Title: " + getTitle());
        System.out.println("Lead Actress: " + leadActress);
    }

	@Override
	public void ratingInfo() {
		System.out.println("Rating "+ (8.3));
	}
}
