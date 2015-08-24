create table artist (
	id integer primary key,
	name varchar(40) not null,
	isBand smallint not null,
	age smallint
);

create table album (
	id integer primary key,
	name varchar(30) not null,
	artist_id integer not null,
	year smallint
);

create table song(
	id integer primary key,
	album_id integer not null,
	name varchar(50) not null,
	genre varchar(30)
);