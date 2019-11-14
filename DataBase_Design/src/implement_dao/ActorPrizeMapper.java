package implement_dao;

import substance.ActorPrize;

public interface ActorPrizeMapper {
    int deleteByPrimaryKey(String actorPrizeId);

    int insert(ActorPrize record);

    ActorPrize selectByPrimaryKey(String actorPrizeId);

    int updateByPrimaryKey(ActorPrize record);
}