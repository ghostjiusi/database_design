USE [douban]
GO
/****** Object:  Table [dbo].[writer]    Script Date: 11/13/2019 12:48:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[writer](
	[writer_id] [char](8) NOT NULL,
	[writer_name] [char](8) NOT NULL,
 CONSTRAINT [PK_writer] PRIMARY KEY CLUSTERED 
(
	[writer_id] ASC,
	[writer_name] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tag]    Script Date: 11/13/2019 12:48:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tag](
	[tag_id] [char](8) NOT NULL,
	[tag_name] [varchar](50) NULL,
 CONSTRAINT [PK__tag__4296A2B6164452B1] PRIMARY KEY CLUSTERED 
(
	[tag_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[short_comment_comment]    Script Date: 11/13/2019 12:48:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[short_comment_comment](
	[short_commend_commend_id] [char](8) NOT NULL,
	[user_id] [char](8) NOT NULL,
	[short_commend_id] [char](8) NOT NULL,
	[comment] [nvarchar](max) NULL,
	[is_usef] [char](5) NULL,
 CONSTRAINT [PK_short_comment_comment] PRIMARY KEY CLUSTERED 
(
	[short_commend_commend_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[short_comment]    Script Date: 11/13/2019 12:48:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[short_comment](
	[short_comment_id] [char](8) NOT NULL,
	[user_id] [char](8) NULL,
	[movie_id] [char](8) NULL,
	[comment] [nvarchar](max) NULL,
	[seen] [char](5) NULL,
	[score] [float] NULL,
 CONSTRAINT [PK_short_comment] PRIMARY KEY CLUSTERED 
(
	[short_comment_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[movie_writer]    Script Date: 11/13/2019 12:48:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[movie_writer](
	[writer_id] [char](8) NOT NULL,
	[movie_id] [char](8) NOT NULL,
 CONSTRAINT [PK_movie_writer] PRIMARY KEY CLUSTERED 
(
	[writer_id] ASC,
	[movie_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[movie_tag]    Script Date: 11/13/2019 12:48:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[movie_tag](
	[tag_id] [char](8) NOT NULL,
	[movie_id] [char](8) NOT NULL,
 CONSTRAINT [PK__movie_ta__CAAA7DC21A14E395] PRIMARY KEY CLUSTERED 
(
	[tag_id] ASC,
	[movie_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[movie_prize]    Script Date: 11/13/2019 12:48:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[movie_prize](
	[movie_prize_id] [char](8) NOT NULL,
	[movie_id] [char](8) NOT NULL,
	[situation] [nvarchar](max) NULL,
 CONSTRAINT [PK_movie_prize] PRIMARY KEY CLUSTERED 
(
	[movie_prize_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[movie_director]    Script Date: 11/13/2019 12:48:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[movie_director](
	[director_id] [char](8) NOT NULL,
	[movie_id] [char](8) NOT NULL,
 CONSTRAINT [PK_movie_director] PRIMARY KEY CLUSTERED 
(
	[director_id] ASC,
	[movie_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[movie_actor]    Script Date: 11/13/2019 12:48:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[movie_actor](
	[actor_id] [char](8) NOT NULL,
	[movie_id] [char](8) NOT NULL,
 CONSTRAINT [PK_movie_actor] PRIMARY KEY CLUSTERED 
(
	[actor_id] ASC,
	[movie_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[movie]    Script Date: 11/13/2019 12:48:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[movie](
	[movie_id] [char](8) NOT NULL,
	[movie_name] [nvarchar](100) NOT NULL,
 CONSTRAINT [PK__movie__83CDF7490AD2A005] PRIMARY KEY CLUSTERED 
(
	[movie_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[long_comment_comment]    Script Date: 11/13/2019 12:48:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[long_comment_comment](
	[long_comment_comment_id] [char](8) NOT NULL,
	[user_id] [char](8) NOT NULL,
	[long_comment_id] [char](8) NOT NULL,
	[comment] [nvarchar](max) NULL,
 CONSTRAINT [PK_long_comment_comment] PRIMARY KEY CLUSTERED 
(
	[long_comment_comment_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[long_comment]    Script Date: 11/13/2019 12:48:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[long_comment](
	[long_comment_id] [char](8) NOT NULL,
	[user_id] [char](8) NOT NULL,
	[movie_id] [char](8) NOT NULL,
	[comment] [nchar](10) NULL,
 CONSTRAINT [PK_long_comment] PRIMARY KEY CLUSTERED 
(
	[long_comment_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[login_inf]    Script Date: 11/13/2019 12:48:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[login_inf](
	[user_id] [char](8) NOT NULL,
	[login_name] [varchar](10) NULL,
	[login_password] [varchar](20) NULL,
	[profile_photo] [image] NULL,
	[diary] [nvarchar](200) NULL,
	[login_message] [nvarchar](200) NULL,
 CONSTRAINT [PK__login_in__C2C971DB07020F21] PRIMARY KEY CLUSTERED 
(
	[user_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[groups_user_comment_comment]    Script Date: 11/13/2019 12:48:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[groups_user_comment_comment](
	[groups_comment_comment_id] [char](8) NOT NULL,
	[groups_comment_id] [char](8) NOT NULL,
	[groups_user_id] [char](8) NOT NULL,
	[comment] [nvarchar](max) NULL,
 CONSTRAINT [PK_groups_user_comment_comment] PRIMARY KEY CLUSTERED 
(
	[groups_comment_comment_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[groups_user_comment]    Script Date: 11/13/2019 12:48:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[groups_user_comment](
	[groups_comment_id] [char](8) NOT NULL,
	[groups_user_id] [char](8) NOT NULL,
	[comment] [nvarchar](max) NULL,
 CONSTRAINT [PK_groups_user_comment] PRIMARY KEY CLUSTERED 
(
	[groups_comment_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[groups_user]    Script Date: 11/13/2019 12:48:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[groups_user](
	[groups_user_id] [char](8) NOT NULL,
	[groups_id] [char](8) NOT NULL,
	[user] [nchar](10) NULL,
 CONSTRAINT [PK_groups_users] PRIMARY KEY CLUSTERED 
(
	[groups_user_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[groups]    Script Date: 11/13/2019 12:48:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[groups](
	[groups_id] [char](8) NOT NULL,
	[groups_name] [varchar](20) NULL,
 CONSTRAINT [PK__groups__54CA4F671DE57479] PRIMARY KEY CLUSTERED 
(
	[groups_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[director]    Script Date: 11/13/2019 12:48:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[director](
	[director_id] [char](8) NOT NULL,
	[director_name] [nvarchar](50) NULL,
 CONSTRAINT [PK__director__F5205E4903317E3D] PRIMARY KEY CLUSTERED 
(
	[director_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[actor_prize]    Script Date: 11/13/2019 12:48:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[actor_prize](
	[actor_prize_id] [char](8) NOT NULL,
	[acator_id] [char](8) NOT NULL,
	[prize] [varchar](50) NOT NULL,
 CONSTRAINT [PK_actor_prize] PRIMARY KEY CLUSTERED 
(
	[actor_prize_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[actor]    Script Date: 11/13/2019 12:48:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[actor](
	[actor_id] [char](8) NOT NULL,
	[actor_name] [nvarchar](50) NULL,
 CONSTRAINT [PK__actor__8B2447B47F60ED59] PRIMARY KEY CLUSTERED 
(
	[actor_id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
