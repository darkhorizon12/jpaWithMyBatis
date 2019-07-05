create sequence hibernate_sequence start with 1 increment by 1
create table person (id bigint not null, name varchar(255), age int, primary key (id))