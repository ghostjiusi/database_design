package DAO;
import Concrete.*;
public class DAOfactory {
	public static ActorDao getActorDao() {return new conActor();}
	public static AllactorDao getAllactorDao() {return new conAllactor();} 
}
