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
		w.setWriterName("苏珊");
		wmp.insert(w);
		System.out.println("插入成功");
	}
	
	public void writerDelete() {
		wmp.deleteByPrimaryKey("S1");
		System.out.println("删除成功");
	}
	public WriterKey getWriter() {
		return wmp.selectByPrimaryKey("S1");
	}
	public void updata() {
		WriterKey w = new WriterKey();
		w.setWriterId("S1");
		w.setWriterName("苏三");
		wmp.updateByPrimaryKey(w);
		System.out.println("更新成功");
	}
}
