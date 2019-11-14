package implement_dao;

import substance.ShortCommentComment;

public interface ShortCommentCommentMapper {
    int deleteByPrimaryKey(String shortCommendCommendId);

    int insert(ShortCommentComment record);

    ShortCommentComment selectByPrimaryKey(String shortCommendCommendId);

    int updateByPrimaryKey(ShortCommentComment record);
}