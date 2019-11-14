package implement_dao;

import substance.Actor;

public interface ActorMapper {
    int deleteByPrimaryKey(String actorId);

	int insert(Actor record);

	Actor selectByPrimaryKey(String actorId);

	int updateByPrimaryKey(Actor record);

}