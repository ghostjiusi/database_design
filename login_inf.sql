create table login_inf
(
	login_id varchar(10) primary key,
	login_name varchar(10),
	login_password varchar(20),
	profile_photo image,
	diary nvarchar(200),
	login_message nvarchar(200)
)