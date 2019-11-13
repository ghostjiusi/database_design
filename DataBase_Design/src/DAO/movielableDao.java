package DAO;
import java.util.ArrayList;

import Entity.*;
//这是一张电影和标签对应的表
public interface movielableDao {
	public boolean insertmovielable(movielable a);//给某一个电影新加一个标签
	public boolean deletemovielable(movielable a );//删除这个电影的这一个标签
	//这里我们又可以扩展内容：
	public ArrayList<movielable> getmovie(String s);//我们可以获得s标签的所有电影
	public ArrayList<movielable> getlables(String s);//我们可以获得s电影的所有标签
}
