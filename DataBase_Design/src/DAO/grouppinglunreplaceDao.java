package DAO;
import Entity.*;
//����ĳ��Ա������һ��Ա�����۽��лظ�,ǰ��ʱ��groupuserpl�����Ѿ�����һ����Ϣ����Ӧ��grouppinglunreplace.java��plid���ԣ�
public interface grouppinglunreplaceDao {
	public boolean insterreplace(grouppinglunreplace a);//��Ա�ظ�С�����۱��е�ĳһ�����ݣ����õĲ���������֮ǰ�ı����Ѿ�����
	public boolean deletereplace(String s);//ɾ�������s�Ļظ�����
	public boolean updatareplace(grouppinglunreplace a);//���ڸ������۽����޸�
	//֮��Ҳ������չһЩ����ĳ�û������лظ�֮��ķ���������׸��
}
