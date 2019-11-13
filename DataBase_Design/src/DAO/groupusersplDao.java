package DAO;
import Entity.*;
//这是一张成员的评论表，grouppinglunreplace表中的一个属性就是来自这里）
public interface groupusersplDao {
	public boolean insertpl(groupuserspl a );//给表中增加一个新的评论
	public boolean deletepl(String S);//删除一条编号为S的评论
	//这里我们就可以扩展类似于duanpingDao的功能，例如返回某一用户的所有发言
}
