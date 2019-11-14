package substance;

public class LongCommentComment {
    private String longCommentCommentId;

    private String userId;

    private String longCommentId;

    private String comment;

    public String getLongCommentCommentId() {
        return longCommentCommentId;
    }

    public void setLongCommentCommentId(String longCommentCommentId) {
        this.longCommentCommentId = longCommentCommentId == null ? null : longCommentCommentId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getLongCommentId() {
        return longCommentId;
    }

    public void setLongCommentId(String longCommentId) {
        this.longCommentId = longCommentId == null ? null : longCommentId.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}