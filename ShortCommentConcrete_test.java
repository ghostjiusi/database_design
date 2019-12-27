package test_dao;
import concrete_dao.*;
import implement_dao.*;
import substance.*;
import abs.*;

public class ShortCommentConcrete_test {
	ShortCommentMapper scmp = DAOFactory.getShortCommentMapper();
	public void insert() {
		ShortComment s = new ShortComment();
		s.setComment("好看");
		s.setMovieId("m1");
		s.setScore(10.0);
		s.setSeen("看过");
		s.setUserId("a1");
		s.setShortCommentId("sc1");
		scmp.insert(s);
		System.out.println("插入成功");
	}
	public void delete() {
		scmp.deleteByPrimaryKey("sc1");
		System.out.println("删除成功");
	}
	public void update() {
		ShortComment s = new ShortComment();
		s.setComment("不好看");
		s.setMovieId("m1");
		s.setScore(10.0);
		s.setSeen("a");
		s.setUserId("a1");
		s.setShortCommentId("sc1");
		scmp.updateByPrimaryKey(s);
		System.out.println("更新成功");
	}
	public ShortComment  select() {
		return scmp.selectByPrimaryKey("sc1");
	}
}
