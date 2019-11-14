package implement_dao;

import substance.MovieActorKey;

public interface MovieActorMapper {
    int deleteByPrimaryKey(MovieActorKey key);

    int insert(MovieActorKey record);
}