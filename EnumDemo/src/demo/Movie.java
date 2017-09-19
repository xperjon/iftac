package demo;

public class Movie {

	private String title;
	private int length;
	private MovieGenre genre;

	public Movie(MovieGenre genre) {
		this.genre = genre;
	}

	public MovieGenre getGenre() {
		return genre;
	}
	public void play(int age) {
		boolean test = age < 15;
		if(test && genre == MovieGenre.HORROR) {
			System.out.println("User under age!");
		}
	}
}
