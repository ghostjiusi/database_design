package DAO;
import java.util.ArrayList;

import Entity.*;
//��ǩ��ӵ�б�ǩ��źͱ�ǩ����
public interface LableDao {
	public boolean insertlable(Lable a);//����һ���µı�ǩ
	public boolean deletelable(String s);//ɾ��ĳһ����ǩ��
	//��չһ���µĹ���
	public ArrayList<Lable> getlables();//���ǿ��Է��ر������еı�ǩ����Ϣ
}
