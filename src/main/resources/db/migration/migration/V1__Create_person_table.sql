create table user
(
	id int(10) auto_increment
		primary key,
	account_id varchar(50) null,
	name varchar(50) null,
	token char(36) null,
	gmt_create bigint(19) null,
	gmt_modified bigint(19) null
);