package implement_dao;

import substance.MoviePrize;

public interface MoviePrizeMapper {
    int deleteByPrimaryKey(String moviePrizeId);

    int insert(MoviePrize record);

    MoviePrize selectByPrimaryKey(String moviePrizeId);

    int updateByPrimaryKey(MoviePrize record);
}