package Dao;

import Dao_implement.Course_Dao_imp;
import Dao_implement.StudentHomework_Dao_imp;
import Dao_implement.Student_Dao_imp;

public class DaoFactory
{
	public static DaoFactory instance;//����instanceΪ������  ����ģʽ
	static
	{

		instance = new DaoFactory();	//newһ���������instance
	}	
	private DaoFactory()//˽�л����캯��   ʵ�ֵ���ģʽ
	{

	}	
	public static DaoFactory getInstance()
	{

		return instance;					//����һ���������instance  ���ص���

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
