create database if not exists test;
drop table if exists test.user;
create table test.user (id int auto_increment, name varchar(11), age int, sex int, primary key (id), key name (name));