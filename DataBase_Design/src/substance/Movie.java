package substance;

public class Movie {
    private String movieId;

	private String movieName;

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId == null ? null : movieId.trim();
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName == null ? null : movieName.trim();
	}
}