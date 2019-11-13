package DAO;
import java.util.ArrayList;

import Entity.*;
//对于短评的评论，前提是必须有了具体的短评(指的是duanpingduanping.java中的duanpingid属性）
public interface duanpingduangpingDao {
	public boolean insertduanping(duanpingduanping a);//给已经存在的一条短评添加新的短评
	public boolean deleteduanping(String s);//删除编号为s的短评评论
	public boolean updata(String s);//对于编号s的短评进行更新
	//这里新扩展一个方法就是输出某一用户的所有回复的信息
	public ArrayList<duanping> getlist(String s );//输出编号为s的用户所有回复过的信息
}
