create table if not exists  customer (
  id int(11) not null auto_increment,
  name varchar(100) not null,
  email varchar(1024) not null,
  contact varchar(1024) not null,
  address varchar(1024) not null,
  primary key (id),
  unique key email (email)
) engine=innodb ;
