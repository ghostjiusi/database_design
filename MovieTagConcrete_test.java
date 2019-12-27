package test_dao;

import abs.DAOFactory;
import concrete_dao.MovieTagConcrete;
import implement_dao.MovieTagMapper;
import substance.MovieTagKey;


public class MovieTagConcrete_test {

	 MovieTagMapper  movietagmapper=DAOFactory.getInstance().getMovieTagMapper();
	public void TestInsert()
	{
		 MovieTagKey a=new  MovieTagKey();
		a.setTagId("101");
		a.setMovieId("121");
		movietagmapper.insert(a);
	}
	
	public void TestDelete()
	{
		 MovieTagKey a=new  MovieTagKey();
		a.setTagId("101");
		a.setMovieId("121");
		movietagmapper.deleteByPrimaryKey(a);
		System.out.println("成功删除了这条数据");
	}
	
	public void TestUpdate()
	{
		 //MovieTagKey a=new  MovieTagKey();
			//a.setTagId("12");
			//a.setMovieId("87");
		//	movietagmapper.updateByPrimaryKey(a);
		}
	public void TestSelect()
	{
		// MovieTagKey a=new  MovieTagKey();
		//a=movietagmapper.
		//System.out.println(a.getMoviePrizeId());
	}
}
