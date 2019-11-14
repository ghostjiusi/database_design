package implement_dao;

import substance.GroupsUserCommentComment;

public interface GroupsUserCommentCommentMapper {
    int deleteByPrimaryKey(String groupsCommentCommentId);

    int insert(GroupsUserCommentComment record);

    GroupsUserCommentComment selectByPrimaryKey(String groupsCommentCommentId);

    int updateByPrimaryKey(GroupsUserCommentComment record);
}