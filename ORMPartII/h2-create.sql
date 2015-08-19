create table product (
  id                        bigint not null,
  title                     varchar(255),
  price                     decimal(10),
  quantity                  integer,
  constraint pk_product primary key (id))
;

create table user (
  id                        bigint not null,
  full_name                 varchar(255),
  email                     varchar(255),
  balance                   decimal(10),
  constraint uq_user_email unique (email),
  constraint pk_user primary key (id))
;

create sequence product_seq;

create sequence user_seq;



