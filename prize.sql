create table prize
(
	movie_id nvarchar(10),
	prize nvarchar(100),
	constraint prize_prim primary key(movie_id,prize)
)