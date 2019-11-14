package implement_dao;

import substance.GroupsUser;

public interface GroupsUserMapper {
    int deleteByPrimaryKey(String groupsUserId);

    int insert(GroupsUser record);

    GroupsUser selectByPrimaryKey(String groupsUserId);

    int updateByPrimaryKey(GroupsUser record);
}