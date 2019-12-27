package test_dao;
import concrete_dao.*;
import implement_dao.*;
import substance.*;
import abs.*;

public class ShortCommentConcrete_test {
	ShortCommentMapper scmp = DAOFactory.getShortCommentMapper();
	public void insert() {
		ShortComment s = new ShortComment();
		s.setComment("�ÿ�");
		s.setMovieId("m1");
		s.setScore(10.0);
		s.setSeen("����");
		s.setUserId("a1");
		s.setShortCommentId("sc1");
		scmp.insert(s);
		System.out.println("����ɹ�");
	}
	public void delete() {
		scmp.deleteByPrimaryKey("sc1");
		System.out.println("ɾ���ɹ�");
	}
	public void update() {
		ShortComment s = new ShortComment();
		s.setComment("���ÿ�");
		s.setMovieId("m1");
		s.setScore(10.0);
		s.setSeen("a");
		s.setUserId("a1");
		s.setShortCommentId("sc1");
		scmp.updateByPrimaryKey(s);
		System.out.println("���³ɹ�");
	}
	public ShortComment  select() {
		return scmp.selectByPrimaryKey("sc1");
	}
}
