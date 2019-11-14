package implement_dao;

import substance.LongComment;

public interface LongCommentMapper {
    int deleteByPrimaryKey(String longCommentId);

    int insert(LongComment record);

    LongComment selectByPrimaryKey(String longCommentId);

    int updateByPrimaryKey(LongComment record);
}