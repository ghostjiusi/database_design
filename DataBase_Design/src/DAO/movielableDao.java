package DAO;
import java.util.ArrayList;

import Entity.*;
//����һ�ŵ�Ӱ�ͱ�ǩ��Ӧ�ı�
public interface movielableDao {
	public boolean insertmovielable(movielable a);//��ĳһ����Ӱ�¼�һ����ǩ
	public boolean deletemovielable(movielable a );//ɾ�������Ӱ����һ����ǩ
	//���������ֿ�����չ���ݣ�
	public ArrayList<movielable> getmovie(String s);//���ǿ��Ի��s��ǩ�����е�Ӱ
	public ArrayList<movielable> getlables(String s);//���ǿ��Ի��s��Ӱ�����б�ǩ
}
