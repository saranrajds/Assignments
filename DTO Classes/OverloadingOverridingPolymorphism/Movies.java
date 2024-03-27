package OverloadingOverridingPolymorphism;

class Movie {

	private String title;
	
	public Movie(String title) {
        this.title = title;
    }
	
	 public void displayDetails() {
	        System.out.println("Title: " + title);
    }
}

class RomComMovie extends Movie {

    private String leadActress;
    
	public RomComMovie(String title, String leadActress) {
		super(title);
		this.leadActress = leadActress;
	}
	
	@Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Lead Actress: " + leadActress);
    }
}

class ThrillerMovie extends Movie {
	
	private String director;
	 
    public ThrillerMovie(String title, String director) {
		super(title);
		this.director = director;
	}
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Director: " + director);
    }
}

public class Movies {
	
	public static void main(String[] args) {
		
		Movie romComMovie = new RomComMovie("Movie 1", "xyz");
        Movie thrillerMovie = new ThrillerMovie("Movie 2", "xyz");

        System.out.println("RomCom Movie Details:");
        romComMovie.displayDetails();
        System.out.println();

        System.out.println("Thriller Movie Details:");
        thrillerMovie.displayDetails();
	}
}
