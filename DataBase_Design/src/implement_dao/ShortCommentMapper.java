package implement_dao;

import substance.ShortComment;

public interface ShortCommentMapper {
    int deleteByPrimaryKey(String shortCommentId);

    int insert(ShortComment record);

    ShortComment selectByPrimaryKey(String shortCommentId);

    int updateByPrimaryKey(ShortComment record);
}