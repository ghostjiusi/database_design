package DAO;
import java.util.ArrayList;

import Entity.*;
//演员和他所演的电影表
public interface AllactorDao {
	public boolean insertAllactor(Allactor a);//插入一个演员，和他所演的电影
	public boolean deleteAllactor(String s);//删除编号为S的演员，和他的电影
	public boolean updataAllactor(Allactor a);//更新a演员的信息，更新演员电影表
	//public Allactor getAllactor(String s);//获得编号为S演员，
	public ArrayList<Allactor>getmovie(String s);//获得某演员演的所有电影
	public ArrayList<Allactor>getactor(String s);//获得某电影的所有演员
}
