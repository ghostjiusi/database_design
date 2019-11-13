package DAO;
import java.util.ArrayList;

import Entity.*;
//小组成员表，内容主要是小组编号，和小组内的成员，这里的编号我认为可有可无
public interface groupuserDao {
	public boolean insertgroupuser(groupuser a);//表中添加一条记录，给一个成员进行分组，这里要注意groupuser.java中的属性设置，成员必须在user表中有（为了简单我们先手动让他一致）
	public boolean deletegroupuser(String s);//如果这里有编号可以直接通过编号删除，如果没有就需要通过and删除
	//在这个表中我认为修改时没有意义的
	//这里我们可以扩展一些新的功能
	public ArrayList<groupuser> getmember(String s);//这里我们可以返回某一个组的所有成员
	public ArrayList<groupuser> getgroups(String s);//这里我们可以返回一个成员加了几个组
}
