package test_dao;

import substance.*;

import concrete_dao.*;
import implement_dao.*;
import abs.*;

public class TagConcrete_test {
	TagMapper tmp = DAOFactory.getTagMapper();
	public void insertTag() {
		Tag t = new Tag();
		t.setTagId("s1");
		t.setTagName("╛куд");
		tmp.insert(t);
	}
	public void deleteTag() {	
		tmp.deleteByPrimaryKey("s1");
	}
			
}
