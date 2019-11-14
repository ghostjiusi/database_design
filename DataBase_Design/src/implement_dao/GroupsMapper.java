package implement_dao;

import substance.Groups;

public interface GroupsMapper {
    int deleteByPrimaryKey(String groupsId);

    int insert(Groups record);

    Groups selectByPrimaryKey(String groupsId);

    int updateByPrimaryKey(Groups record);
}