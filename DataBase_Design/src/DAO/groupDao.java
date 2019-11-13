package DAO;
import Entity.*;
//所有的组编号和名称的表
public interface groupDao {
	public boolean insertgroup(group a);//添加一个新的组
	public boolean deletegroup(String s);//删除编号为s的组
	public boolean updata(String s);//对于编号是S的组的更新（主要就是对于名称和其他内容的修改）
	//这里也可以写一个返回所有组信息的方法
}
