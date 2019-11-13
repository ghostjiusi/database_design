package DAO;
import Entity.*;
//短评表（在这里我只要给定duanping.java中的具体对应关系就行了）
public interface duanpingDao {
	public boolean insertduanping(duanping a);//添加一条短评，在测试中，s必须设置好具体的属性
	public boolean deleteduanping(String s);//删除编号为s的短评。
	public boolean updataduanping(duanping a);//对于短评的更新
	public duanping getduanping(String s);//获得编号为s的具体短评信息
	//在这里可以输出具体的某一个用户的所有内容
	//具体的方法就是：public ArrayList<duanping> getlist(duanping a);//输出a用户的所有评论
}
