package DAO;
import java.util.ArrayList;

import Entity.*;
//���ڶ��������ۣ�ǰ���Ǳ������˾���Ķ���(ָ����duanpingduanping.java�е�duanpingid���ԣ�
public interface duanpingduangpingDao {
	public boolean insertduanping(duanpingduanping a);//���Ѿ����ڵ�һ����������µĶ���
	public boolean deleteduanping(String s);//ɾ�����Ϊs�Ķ�������
	public boolean updata(String s);//���ڱ��s�Ķ������и���
	//��������չһ�������������ĳһ�û������лظ�����Ϣ
	public ArrayList<duanping> getlist(String s );//������Ϊs���û����лظ�������Ϣ
}
