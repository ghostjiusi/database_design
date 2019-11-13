package DAO;
import Entity.*;
//组内某成员对于另一成员的评论进行回复,前提时在groupuserpl表中已经存在一条信息（对应的grouppinglunreplace.java的plid属性）
public interface grouppinglunreplaceDao {
	public boolean insterreplace(grouppinglunreplace a);//成员回复小组讨论标中的某一条内容，设置的参数必须在之前的表中已经存在
	public boolean deletereplace(String s);//删除编号是s的回复内容
	public boolean updatareplace(grouppinglunreplace a);//对于该条评论进行修改
	//之后也可以扩展一些返回某用户的所有回复之类的方法，不在赘述
}
