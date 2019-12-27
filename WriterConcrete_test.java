package test_dao;
import substance.*;

import concrete_dao.*;
import implement_dao.*;
import abs.*;
public class WriterConcrete_test {
	WriterMapper wmp = DAOFactory.getWriterMapper();
	public void writerInsert() {
		WriterKey w = new WriterKey();
		w.setWriterId("S1");
		w.setWriterName("��ɺ");
		wmp.insert(w);
		System.out.println("����ɹ�");
	}
	
	public void writerDelete() {
		wmp.deleteByPrimaryKey("S1");
		System.out.println("ɾ���ɹ�");
	}
	public WriterKey getWriter() {
		return wmp.selectByPrimaryKey("S1");
	}
	public void updata() {
		WriterKey w = new WriterKey();
		w.setWriterId("S1");
		w.setWriterName("����");
		wmp.updateByPrimaryKey(w);
		System.out.println("���³ɹ�");
	}
}
