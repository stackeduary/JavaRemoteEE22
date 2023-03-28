select title, store.store_id, max(rental.return_date)
from film inner join inventory inner join store inner join rental on film.film_id = inventory.film_id and inventory.store_id = store.store_id and inventory.inventory_id = rental.inventory_id where title = "academy dinosaur" and store.store_id = 1 order by return_date desc;


select distinct title, return_date from rental inner join inventory inner join film on film.film_id = inventory.film_id and inventory.inventory_id = rental.inventory_id where return_date is null order by return_date asc;

ctrl + l to clear the screen

DDL: create/maintain DB and tables themselves

select user from mysql.user;


create database <db name>;
create user <user name>;


create user 'bill'@'localhost';
GRANT ALL ON `billdatabase`.* TO 'bill'@'localhost';
GRANT ALL ON `sakila`.* TO 'bill'@'localhost';
select user from mysql.user;
show grants for bill@localhost;
drop user if exists bill@localhost;
create database if not exists billdatabase;

drop user if exists bill@localhost;

CREATE TABLE assets (
    id int not null auto-increment,
    name varchar(255),
    purchase_date date,
    primary key (id)
);

create table friends (id int not null auto_increment, first_name varchar(255), last_name varchar(255), years_known int, primary key (id));
insert into friends (first_name, last_name, years_known) values ("Elon", "Musk", 18), ("Andrus", "Aas", 27), ("Jay-", "Z", 2), ("Kim", "Dotcom", 10);

alter table assets auto_increment = 1;
alter table assets change column `id` `id` int not null;
alter table assets add primary key(id);
ALTER TABLE assets CHANGE id id INT AUTO_INCREMENT;
alter table assets add column purchase_price double(18, 2);
ALTER TABLE assets MODIFY purchase_price double(18, 2) AFTER name;
insert into assets (purchase_price) values (330000.13, 24000.56); INCORRECT
UPDATE assets SET purchase_price = 330000.13 WHERE name like "Lambo%";
UPDATE assets SET purchase_price = 24000.56 WHERE name like "%rol%";
UPDATE assets SET purchase_price = purchase_price*1.07; --WHERE name like "%rol%";
delete from assets where id = 3;


insert into assets (name, purchase_date) values ('Lamborghini', '2023-03-12'), ('Rolex', '2023-03-11');
insert into assets (name, purchase_price, purchase_date) values ('Rolls Royce', 361444.77, '2023-03-18');
insert into assets (name, purchase_price, purchase_date) values ('Kadriorg Palace', 1361814.20, '2023-03-19');

insert into assets (name, purchase_date) values ('Lamborghini', '2023-03-12'), ('Lamborghini', '2023-03-13'), ('Lamborghini', '2023-03-14'), ('Lamborghini', '2023-03-15');

UPDATE assets SET purchase_price = 430000.13 WHERE name like "Lambo%";

drop table friends;

revoke if exists all, grant option from bill@localhost;


NEW QUERIES

1. Show all fields (columns) from the actor table.
`select * from actor;`

2. Show only the last_name field from the actor table.


3. Show title, description, rental_duration, rental_rate, total_rental_cost from the film table


4. Show all the unique last names in the actor table.


5. Show all the unique ZIP codes in the address table.


6. Show all the unique ratings in the film table.


7. Show all movies (title, description, rating, movie length) that are at least three hours long.


8. Show all payments made after 5/27/2005 (payment id, amount, and payment date).


9. Show all payments made on 5/27/2005.


10. Show all customers having last names starting with 'S' and first names ending with 'N'.


11. Show all customers where the customer is inactive or has a last name beginning with 'M'.


12. Show all categories with primary key >= 4 and name beginning with either 'C', 'S' or 'T'.


13. Show all fields about staffmembers except their passwords for records that have a password.


14. Show all fields about staffmembers except their passwords for records that DON'T have a password.


15. Show the districts and phone numbers for all customers from California, England, Taipei, or West Java.


16. Show the payment amount, IDs and payment dates for payments made on 05/25/2005, 05/27/2005, and 05/29/2005.


17. Show all information for movies rated PG, PG-13 or R.


18. Show all information for payments made on 7/4/2005
