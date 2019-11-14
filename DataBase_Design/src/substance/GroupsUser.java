package substance;

public class GroupsUser {
    private String groupsUserId;

    private String groupsId;

    private String user;

    public String getGroupsUserId() {
        return groupsUserId;
    }

    public void setGroupsUserId(String groupsUserId) {
        this.groupsUserId = groupsUserId == null ? null : groupsUserId.trim();
    }

    public String getGroupsId() {
        return groupsId;
    }

    public void setGroupsId(String groupsId) {
        this.groupsId = groupsId == null ? null : groupsId.trim();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }
}