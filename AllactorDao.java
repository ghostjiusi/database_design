package DAO;
import java.util.ArrayList;

import Entity.*;
//��Ա�������ݵĵ�Ӱ��
public interface AllactorDao {
	public boolean insertAllactor(Allactor a);//����һ����Ա���������ݵĵ�Ӱ
	public boolean deleteAllactor(String s);//ɾ�����ΪS����Ա�������ĵ�Ӱ
	public boolean updataAllactor(Allactor a);//����a��Ա����Ϣ��������Ա��Ӱ��
	//public Allactor getAllactor(String s);//��ñ��ΪS��Ա��
	public ArrayList<Allactor>getmovie(String s);//���ĳ��Ա�ݵ����е�Ӱ
	public ArrayList<Allactor>getactor(String s);//���ĳ��Ӱ��������Ա
}
