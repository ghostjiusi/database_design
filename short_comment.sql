create table short_comment
(
	login_id varchar(10),
	movie_id varchar(10),
	comment nvarchar(100),
	is_forward nvarchar(10),
	movie_score float,
	constraint short_comment_prim primary key(login_id,movie_id)
)