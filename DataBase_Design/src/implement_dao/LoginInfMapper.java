package implement_dao;

import substance.LoginInf;

public interface LoginInfMapper {
    int deleteByPrimaryKey(String userId);

    int insert(LoginInf record);

    LoginInf selectByPrimaryKey(String userId);

    int updateByPrimaryKey(LoginInf record);
}