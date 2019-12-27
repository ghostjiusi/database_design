package DAO;
import java.util.ArrayList;

import Entity.*;
//这是用户表
public interface UserDao {
	public boolean insertuser(User a);//添加一个用户
	public boolean deleteuser(String a );//删除编号为s一个用户
	public boolean updatauser(String s);//修改编号为s的用户
	public User getintroduction(String s);//获得某编号s的用户的所有信息
	public ArrayList<User> getlist();//获得所有用户
}
