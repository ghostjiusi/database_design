package substance;

public class ShortCommentComment {
    private String shortCommendCommendId;

    private String userId;

    private String shortCommendId;

    private String comment;

    private String isUsef;

    public String getShortCommendCommendId() {
        return shortCommendCommendId;
    }

    public void setShortCommendCommendId(String shortCommendCommendId) {
        this.shortCommendCommendId = shortCommendCommendId == null ? null : shortCommendCommendId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getShortCommendId() {
        return shortCommendId;
    }

    public void setShortCommendId(String shortCommendId) {
        this.shortCommendId = shortCommendId == null ? null : shortCommendId.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getIsUsef() {
        return isUsef;
    }

    public void setIsUsef(String isUsef) {
        this.isUsef = isUsef == null ? null : isUsef.trim();
    }
}