package substance;

public class Groups {
    private String groupsId;

    private String groupsName;

    public String getGroupsId() {
        return groupsId;
    }

    public void setGroupsId(String groupsId) {
        this.groupsId = groupsId == null ? null : groupsId.trim();
    }

    public String getGroupsName() {
        return groupsName;
    }

    public void setGroupsName(String groupsName) {
        this.groupsName = groupsName == null ? null : groupsName.trim();
    }
}