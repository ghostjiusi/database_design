package DAO;
import Entity.*;
//��������������ֻҪ����duanping.java�еľ����Ӧ��ϵ�����ˣ�
public interface duanpingDao {
	public boolean insertduanping(duanping a);//���һ���������ڲ����У�s�������úþ��������
	public boolean deleteduanping(String s);//ɾ�����Ϊs�Ķ�����
	public boolean updataduanping(duanping a);//���ڶ����ĸ���
	public duanping getduanping(String s);//��ñ��Ϊs�ľ��������Ϣ
	//�����������������ĳһ���û�����������
	//����ķ������ǣ�public ArrayList<duanping> getlist(duanping a);//���a�û�����������
}
