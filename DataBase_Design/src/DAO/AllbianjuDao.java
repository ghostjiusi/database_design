package DAO;
import java.util.ArrayList;

import Entity.*;
//������ָ���ĵ�Ӱ��
public interface AllbianjuDao {
	public boolean insertAllbianju(Allbianju a);//ĳ����±���һ����Ӱ
	public boolean deleteAllbianju(Allbianju a);//ɾ��ĳ����ĳһ����Ӱ
	public boolean updataAllbianju(Allbianju a);//ĳ���ĵ�Ӱ��Ϣ���˱仯
	
	public ArrayList<Allbianju> getmovies(String s);//���ĳ�����������е�Ӱ
	public ArrayList<Allbianju> getbianju(String s);//���ĳ��Ӱ�ı��
}
