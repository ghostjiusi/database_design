package implement_dao;

import substance.Movie;

public interface MovieMapper {
    int deleteByPrimaryKey(String movieId);

	int insert(Movie record);

	Movie selectByPrimaryKey(String movieId);

	int updateByPrimaryKey(Movie record);
}