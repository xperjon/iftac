package demo;

public class Main {

	public static void main(String[] args) {
		Movie movie = new Movie(MovieGenre.ACTION);
		MovieGenre genre = movie.getGenre();
	}
}
