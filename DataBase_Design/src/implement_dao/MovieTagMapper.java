package implement_dao;

import substance.MovieTagKey;

public interface MovieTagMapper {
    int deleteByPrimaryKey(MovieTagKey key);

    int insert(MovieTagKey record);
}