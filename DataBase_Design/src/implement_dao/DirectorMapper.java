package implement_dao;

import substance.Director;

public interface DirectorMapper {
    int deleteByPrimaryKey(String directorId);

    int insert(Director record);

    Director selectByPrimaryKey(String directorId);

    int updateByPrimaryKey(Director record);
}