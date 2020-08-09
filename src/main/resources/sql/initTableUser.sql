create database if not exists noob;
drop table if exists noob.user;
create table noob.user (id int auto_increment, name varchar(11), age int, sex int, primary key (id), key name (name));