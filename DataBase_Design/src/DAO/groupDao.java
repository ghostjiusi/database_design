package DAO;
import Entity.*;
//���е����ź����Ƶı�
public interface groupDao {
	public boolean insertgroup(group a);//���һ���µ���
	public boolean deletegroup(String s);//ɾ�����Ϊs����
	public boolean updata(String s);//���ڱ����S����ĸ��£���Ҫ���Ƕ������ƺ��������ݵ��޸ģ�
	//����Ҳ����дһ��������������Ϣ�ķ���
}
