package Dao;

import Dao_implement.Course_Dao_imp;
import Dao_implement.StudentHomework_Dao_imp;
import Dao_implement.Student_Dao_imp;

public class DaoFactory
{
	public static DaoFactory instance;//声明instance为工厂类  单例模式
	static
	{

		instance = new DaoFactory();	//new一个工厂类的instance
	}	
	private DaoFactory()//私有化构造函数   实现单例模式
	{

	}	
	public static DaoFactory getInstance()
	{

		return instance;					//返回一个工厂类的instance  返回单例

	}	
	
	public static Student_Dao getStudentDAO()
	{
		return new Student_Dao_imp();
	}
	public static Course_Dao getCourseDao()
	{
		return new Course_Dao_imp();
	}
	public static StudentHomework_Dao getStudentHomeworkDao()
	{
		return new StudentHomework_Dao_imp();
	}
	

}
