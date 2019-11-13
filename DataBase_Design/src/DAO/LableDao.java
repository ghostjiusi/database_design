package DAO;
import java.util.ArrayList;

import Entity.*;
//标签表，拥有标签编号和标签内容
public interface LableDao {
	public boolean insertlable(Lable a);//增加一条新的标签
	public boolean deletelable(String s);//删除某一个标签的
	//扩展一个新的功能
	public ArrayList<Lable> getlables();//我们可以返回表中所有的标签和信息
}
