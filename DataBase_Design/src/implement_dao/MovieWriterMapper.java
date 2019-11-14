package implement_dao;

import substance.MovieWriterKey;

public interface MovieWriterMapper {
    int deleteByPrimaryKey(MovieWriterKey key);

    int insert(MovieWriterKey record);
}