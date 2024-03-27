package dtoclasswithattributes;

class Movie {

	private String title;
	private String director;
	private int releaseYear;
	private String heroName;
	private String heroineName;
	private static double averageRating = 0.0;

	public static double getAverageRating() {
		return averageRating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getHeroineName() {
		return heroineName;
	}

	public void setHeroineName(String heroineName) {
		this.heroineName = heroineName;
	}

	public void displayDetails() {
		System.out.println("Title: " + title);
		System.out.println("Release Year: " + releaseYear);
		System.out.println("Director: " + director);
		System.out.println("HeroName: " + heroName);
		System.out.println("HeroineName: " + heroineName);
		System.out.println("Average Rating " + getAverageRating());
	}
}

public class Movies {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setDirector("Saran");
		movie.setHeroineName("Jo");
		movie.setHeroName("Suriya");
		movie.setReleaseYear(2024);
		movie.setTitle("Tamil Movie");
		movie.displayDetails();
	}
}
