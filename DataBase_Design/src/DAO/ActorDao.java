package DAO;
import java.util.ArrayList;

import Entity.*;
//���е���Ա��Ϣ��
public interface ActorDao {
	public boolean insertActor(Actor a);
	public boolean deleteActor(String s);
	public boolean updataActor(Actor a);
	public Actor getActor(String s);
	public ArrayList<Actor> getList();
}
