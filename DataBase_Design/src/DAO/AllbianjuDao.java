package DAO;
import java.util.ArrayList;

import Entity.*;
//编剧和他指导的电影表
public interface AllbianjuDao {
	public boolean insertAllbianju(Allbianju a);//某编剧新编了一部电影
	public boolean deleteAllbianju(Allbianju a);//删除某编剧的某一条电影
	public boolean updataAllbianju(Allbianju a);//某编剧的电影信息有了变化
	
	public ArrayList<Allbianju> getmovies(String s);//获得某编剧和他的所有电影
	public ArrayList<Allbianju> getbianju(String s);//获得某电影的编剧
}
