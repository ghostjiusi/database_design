package substance;

public class LongComment {
    private String longCommentId;

    private String userId;

    private String movieId;

    private String comment;

    public String getLongCommentId() {
        return longCommentId;
    }

    public void setLongCommentId(String longCommentId) {
        this.longCommentId = longCommentId == null ? null : longCommentId.trim();
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
}