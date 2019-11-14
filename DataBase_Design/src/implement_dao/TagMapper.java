package implement_dao;

import substance.Tag;

public interface TagMapper {
    int deleteByPrimaryKey(String tagId);

    int insert(Tag record);

    Tag selectByPrimaryKey(String tagId);

    int updateByPrimaryKey(Tag record);
}