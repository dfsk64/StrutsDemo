create table customer(
	id varchar(50) not null primary key,
	type varchar(50) not null,
	name varchar(50),
	role int,
	permission varchar(50),
	email varchar(50),
	phone varchar(50)
);

create table customer_message(
	id int not null primary key,
	type varchar(50),
	cid varchar(50),
	msg varchar(500)
);