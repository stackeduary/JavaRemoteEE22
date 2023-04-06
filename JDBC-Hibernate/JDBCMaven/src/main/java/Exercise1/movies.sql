create database if not exists movies;
use movies;
drop table if exists movies;
create table movies (id int not null auto_increment, title varchar(255) not null, genre varchar(255) not null, yearofrelease int not null, primary key (id));
insert into movies(title, genre, yearofrelease) values ('The Apartment', 'Comedy/Drama/Romance', 1960), ('No Country for Old Men', 'Crime/Drama/Thriller', 2007), ('Zola', 'Black comedy', 2021), ('The Big Lebowski', 'Comedy/Crime', 1998), ("Bill's dummy movie to be edited later", "N/A", 2023);
-- no longer needed once all commands were migrated to Java code (see MovieJDBC.java)