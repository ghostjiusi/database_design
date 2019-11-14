package abs;
/*
 *	工厂方法
 */
import substance.*;

public class DAOFactory {
    public static Actor getActor() { return new Actor(); }
    public static ActorPrize getActorPrize() { return new ActorPrize(); }
    public static Director getDirector() { return new Director(); }
    public static Groups getGroups() { return new Groups(); }
    public static GroupsUser getGroupsUser() { return new GroupsUser(); }
    public static GroupsUserComment getGroupsUserComment() { return new GroupsUserComment(); }
    public static GroupsUserCommentComment getGroupsUserCommentComment() { return new GroupsUserCommentComment(); }
    public static LoginInf getLoginInf() { return new LoginInf(); }
    public static LongComment getLongComment() { return new LongComment(); }
    public static LongCommentComment getLongCommentComment() { return new LongCommentComment(); }
    public static Movie getMovie() { return new Movie(); }
    public static MovieActorKey getMovieActorKey() { return new MovieActorKey(); }
    public static MovieDirectorKey getMovieDirectorKey() { return new MovieDirectorKey(); }
    public static MoviePrize getMoviePrize() { return new MoviePrize(); }
    public static MovieTagKey getMovieTagKey() { return new MovieTagKey(); }
    public static MovieWriterKey getMovieWriterKey() { return new MovieWriterKey(); }
    public static ShortComment getShortComment() { return new ShortComment(); }
    public static ShortCommentComment getShortCommentComment() { return new ShortCommentComment(); }
    public static Tag getTag() { return new Tag(); }
    public static WriterKey getWriterKey() { return new WriterKey(); }
}
