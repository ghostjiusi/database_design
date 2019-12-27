package test_dao;

import abs.DAOFactory;
import concrete_dao.MovieWriterConcrete;
import implement_dao.MovieWriterMapper;
import substance.MovieWriterKey;

public class MovieWriterConcrete_test {

	MovieWriterMapper moviewritermapper=DAOFactory.getInstance().getMovieWriterMapper();
	public void TestInsert()
	{
		MovieWriterKey a=new  MovieWriterKey();
		a.setWriterId("187");
		a.setMovieId("191");
		moviewritermapper.insert(a);
	}
	
	public void TestDelete()
	{
		MovieWriterKey a=new  MovieWriterKey();
		a.setWriterId("187");
		a.setMovieId("191");
		moviewritermapper.deleteByPrimaryKey(a);
		System.out.println("�ɹ�ɾ������������");
	}
	
	public void TestUpdate()
	{
		//MovieWriterKey a=new  MovieWriterKey();
		//a.setWriterId("187");
		//a.setMovieId("191");
		//moviewritermapper.updateByPrimaryKey(a);
		}
	public void TestSelect()
	{
		
		//moviewritermapper.selectByPrimaryKey(a);
		//System.out.println(a.getMoviePrizeId());
	}
}
