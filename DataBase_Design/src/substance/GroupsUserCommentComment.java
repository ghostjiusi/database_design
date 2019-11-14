package substance;

public class GroupsUserCommentComment {
    private String groupsCommentCommentId;

    private String groupsCommentId;

    private String groupsUserId;

    private String comment;

    public String getGroupsCommentCommentId() {
        return groupsCommentCommentId;
    }

    public void setGroupsCommentCommentId(String groupsCommentCommentId) {
        this.groupsCommentCommentId = groupsCommentCommentId == null ? null : groupsCommentCommentId.trim();
    }

    public String getGroupsCommentId() {
        return groupsCommentId;
    }

    public void setGroupsCommentId(String groupsCommentId) {
        this.groupsCommentId = groupsCommentId == null ? null : groupsCommentId.trim();
    }

    public String getGroupsUserId() {
        return groupsUserId;
    }

    public void setGroupsUserId(String groupsUserId) {
        this.groupsUserId = groupsUserId == null ? null : groupsUserId.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}