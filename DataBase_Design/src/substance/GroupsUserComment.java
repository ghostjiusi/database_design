package substance;

public class GroupsUserComment {
    private String groupsCommentId;

    private String groupsUserId;

    private String comment;

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