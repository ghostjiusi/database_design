package implement_dao;

import substance.LongCommentComment;

public interface LongCommentCommentMapper {
    int deleteByPrimaryKey(String longCommentCommentId);

    int insert(LongCommentComment record);

    LongCommentComment selectByPrimaryKey(String longCommentCommentId);

    int updateByPrimaryKey(LongCommentComment record);
}