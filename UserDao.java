package DAO;
import java.util.ArrayList;

import Entity.*;
//�����û���
public interface UserDao {
	public boolean insertuser(User a);//���һ���û�
	public boolean deleteuser(String a );//ɾ�����Ϊsһ���û�
	public boolean updatauser(String s);//�޸ı��Ϊs���û�
	public User getintroduction(String s);//���ĳ���s���û���������Ϣ
	public ArrayList<User> getlist();//��������û�
}
