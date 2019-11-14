package substance;

public class MoviePrize {
    private String moviePrizeId;

    private String movieId;

    private String situation;

    public String getMoviePrizeId() {
        return moviePrizeId;
    }

    public void setMoviePrizeId(String moviePrizeId) {
        this.moviePrizeId = moviePrizeId == null ? null : moviePrizeId.trim();
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId == null ? null : movieId.trim();
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation == null ? null : situation.trim();
    }
}