create table person (
	id integer primary key,
	name varchar(40) not null,
	age integer
);

create table pet (
	id integer primary key,
	name varchar(30) not null,
	type varchar(20),
	isAlive smallint
);

create table person_pet(
	person_id,
	pet_id,
	primary key(person_id, pet_id)
);