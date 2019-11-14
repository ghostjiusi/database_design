package implement_dao;

import substance.GroupsUserComment;

public interface GroupsUserCommentMapper {
    int deleteByPrimaryKey(String groupsCommentId);

    int insert(GroupsUserComment record);

    GroupsUserComment selectByPrimaryKey(String groupsCommentId);

    int updateByPrimaryKey(GroupsUserComment record);
}