package DAO;
import java.util.ArrayList;

import Entity.*;
//С���Ա��������Ҫ��С���ţ���С���ڵĳ�Ա������ı������Ϊ���п���
public interface groupuserDao {
	public boolean insertgroupuser(groupuser a);//�������һ����¼����һ����Ա���з��飬����Ҫע��groupuser.java�е��������ã���Ա������user�����У�Ϊ�˼��������ֶ�����һ�£�
	public boolean deletegroupuser(String s);//��������б�ſ���ֱ��ͨ�����ɾ�������û�о���Ҫͨ��andɾ��
	//�������������Ϊ�޸�ʱû�������
	//�������ǿ�����չһЩ�µĹ���
	public ArrayList<groupuser> getmember(String s);//�������ǿ��Է���ĳһ��������г�Ա
	public ArrayList<groupuser> getgroups(String s);//�������ǿ��Է���һ����Ա���˼�����
}
