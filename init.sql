create table user(
	id bigint primary key auto_increment,
	password varchar(255) not null,
	username varchar(255) not null;
);

insert into user (username, password) values ("charlie", "secrt-unicorn");