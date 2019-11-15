package abs;
import substance.*;
import concrete_dao.*;
import implement_dao.*;

public class DAOFactory {
	public static DAOFactory instance;//声明instance为工厂类  单例模式
	static
	{

		instance = new DAOFactory();	//new一个工厂类的instance
	}	
	private DAOFactory()//私有化构造函数   实现单例模式
	{

	}	
	public static DAOFactory getInstance()
	{

		return instance;					//返回一个工厂类的instance  返回单例

	}
	
    public static ActorMapper getActorMapper() { return new ActorConcrete(); }
    public static ActorPrizeMapper getActorPrizeMapper() { return new ActorPrizeConcrete(); }
    public static DirectorMapper getDirectorMapper() { return new DirectorConcrete(); }
    public static GroupsMapper getGroupsMapper() { return new GroupsConcrete(); }
    public static GroupsUserMapper getGroupsUserMapper() { return new GroupsUserConcrete(); }
    public static GroupsUserCommentMapper getGroupsUserCommentMapper() { return new GroupsUserCommentConcrete(); }
    public static GroupsUserCommentCommentMapper getGroupsUserCommentCommentMapper() { return new GroupsUserCommentCommentConcrete(); }
    public static LoginInfMapper getLoginInfMapper() { return new LoginInfConcrete(); }
    public static LongCommentMapper getLongCommentMapper() { return new LongCommentConcrete(); }
    public static LongCommentCommentMapper getLongCommentCommentMapper() { return new LongCommentCommentConcrete(); }
    public static MovieMapper getMovieMapper() { return new MovieConcrete(); }
    public static MovieActorMapper getMovieActorMapper() { return new MovieActorConcrete(); }
    public static MovieDirectorMapper getMovieDirectorMapper() { return new MovieDirectorConcrete(); }
    public static MoviePrizeMapper getMoviePrizeMapper() { return new MoviePrizeConcrete(); }
    public static MovieTagMapper getMovieTagMapper() { return new MovieTagConcrete(); }
    public static MovieWriterMapper getMovieWriterMapper() { return new MovieWriterConcrete(); }
    public static ShortCommentMapper getShortCommentMapper() { return new ShortCommentConcrete(); }
    public static ShortCommentCommentMapper getShortCommentCommentMapper() { return new ShortCommentCommentConcrete(); }
    public static TagMapper getTagMapper() { return new TagConcrete(); }
    public static WriterMapper getWriterMapper() { return new WriterConcrete(); }

}
