package substance;

public class ShortComment {
    private String shortCommentId;

    private String userId;

    private String movieId;

    private String comment;

    private String seen;

    private Double score;

    public String getShortCommentId() {
        return shortCommentId;
    }

    public void setShortCommentId(String shortCommentId) {
        this.shortCommentId = shortCommentId == null ? null : shortCommentId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId == null ? null : movieId.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getSeen() {
        return seen;
    }

    public void setSeen(String seen) {
        this.seen = seen == null ? null : seen.trim();
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}