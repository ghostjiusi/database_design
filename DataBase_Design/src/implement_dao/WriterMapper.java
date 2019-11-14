package implement_dao;

import substance.WriterKey;

public interface WriterMapper {
    int deleteByPrimaryKey(WriterKey key);

    int insert(WriterKey record);
}