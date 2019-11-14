package implement_dao;

import substance.MovieDirectorKey;

public interface MovieDirectorMapper {
    int deleteByPrimaryKey(MovieDirectorKey key);

    int insert(MovieDirectorKey record);

}