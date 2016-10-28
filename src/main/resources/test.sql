mysql -u root -p

#password is root

->use mysql;

->create database bootconfig;

->CREATE USER 'john'@'localhost' IDENTIFIED BY '12345';

->INSERT INTO db (HOST,Db,USER,Select_priv,Insert_priv,Update_priv,Delete_priv,Create_priv,Drop_priv,Index_priv, Alter_priv) VALUES('localhost',
'bootconfig','john','Y','Y','Y','Y','N','N','N','N');

->select host, user from mysql.user;

->create table user(id int(4) not null primary key auto_increment, name char(20) not null, sex int(4) not null default '0', degree double(16,2));