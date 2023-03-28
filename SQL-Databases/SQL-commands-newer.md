select title, store.store_id, max(rental.return_date)
from film inner join inventory inner join store inner join rental
    on film.film_id = inventory.film_id and inventory.store_id = store.store_id and inventory.inventory_id = rental.inventory_id
where title = "academy dinosaur" and store.store_id = 1
order by return_date desc;


select title, inventory.store_id, max(rental.rental_date), rental.return_date
from film inner join inventory inner join rental
    on film.film_id = inventory.film_id and inventory.inventory_id = rental.inventory_id
where title = "academy dinosaur" and inventory.store_id = 1
order by return_date desc;


**A simpler query that still answers the question**
select title, inventory.store_id, rental.inventory_id, rental.rental_date, rental.return_date
from film inner join inventory inner join rental
    on film.film_id = inventory.film_id and inventory.inventory_id = rental.inventory_id
where title = "academy dinosaur" and inventory.store_id = 1
order by return_date desc;


select distinct title, return_date from rental inner join inventory inner join film on film.film_id = inventory.film_id and inventory.inventory_id = rental.inventory_id where return_date is null order by return_date asc;

ctrl + l to clear the screen (Linux, macOS (I'm guessing))
`system cls` on Windows

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
`select last_name from actor;`

3. Show title, description, rental_duration, rental_rate, total_rental_cost from the film table


4. Show all the unique last names in the actor table.
`select distinct last_name from actor;`

5. Show all the unique ZIP codes in the address table.
`select postal_code, count(*) from address group by postal_code having count(*) = 1;`
`select distinct postal_code from address;`

6. Show all the unique ratings in the film table.
`select distinct rating from film;`
`select distinct rating, count(rating) from film group by rating;`

7. Show all movies (title, description, rating, movie length) that are at least three hours long.
`select title, description, rating, length from film where length >= 180;`

8. Show all payments made after 5/27/2005 (payment id, amount, and payment date).
`select payment_id, amount, payment_date from payment where payment_date > '2005-05-27' order by payment_date desc limit 10;`

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









create database if not exists emp_super;
create table if not exists emp_super(
employee varchar(255),
supervisor varchar(255)
);
insert into emp_super(employee, supervisor) values ("Bob", "Alice"), ("Mary", "Susan"), ("Alice", "David"), ("David", "Mary");

select distinct s.supervisor, t.supervisor from emp_super as s cross join emp_super as t where
s.supervisor = t.employee;

select distinct s.supervisor, t.supervisor from emp_super as s, emp_super as t where
s.supervisor = t.employee;

with test (employee, supervisor) as
(select 'Bob', 'Alice'   from dual union all
select 'Mary', 'Susan'  from dual union all
select 'Alice', 'David' from dual union all
select 'David', 'Mary'  from dual
)
select sys_connect_by_path(supervisor, '->') sv
from test
start with employee = 'Bob'
connect by employee = prior supervisor;




select distinct s.supervisor, t.supervisor
from emp_super as s, emp_super as t
where s.supervisor = t.employee;


WITH CTE AS (
SELECT Supervisor
FROM emp_super
WHERE employee='Bob'
UNION ALL
SELECT tt.Supervisor
FROM emp_super tt
INNER JOIN CTE ON CTE.Supervisor = tt.employee
)
SELECT *
FROM CTE;



SELECT l1.employee AS e1, l1.supervisor AS sl1, l2.supervisor AS sl2, l3.supervisor as sl3, l4.supervisor as sl4 FROM emp_super AS l1 LEFT JOIN emp_super AS l2 ON l2.employee = l1.supervisor LEFT JOIN emp_super AS l3 ON l3.employee = l2.supervisor LEFT JOIN emp_super AS l4 ON l4.employee = l3.supervisor  WHERE l1.employee = 'Bob';


WITH RECURSIVE supervisor_chain AS (
  SELECT supervisor, employee
  FROM emp_super
  WHERE employee = 'Bob'
  UNION
  SELECT emp_super.supervisor, supervisor_chain.employee
  FROM emp_super
  JOIN supervisor_chain ON emp_super.employee = supervisor_chain.supervisor
)
SELECT * FROM supervisor_chain;


id = employee
title = supervisor
category = emp_super
substitute on https://www.mysqltutorial.org/mysql-adjacency-list-tree/

empty set:
WITH RECURSIVE category_path (employee, supervisor, path) AS
(
  SELECT employee, supervisor, supervisor as path
    FROM emp_super
    WHERE supervisor IS NULL
  UNION ALL
  SELECT c.employee, c.supervisor, CONCAT(cp.path, ' > ', c.supervisor)
    FROM category_path AS cp JOIN emp_super AS c
      ON cp.employee = c.supervisor
)
SELECT * FROM category_path
ORDER BY path;

doesn't work:
WITH RECURSIVE category_path (employee, supervisor, path) AS
(
  SELECT employee, supervisor as path
    FROM emp_super
    WHERE supervisor IS NULL
  UNION ALL
  SELECT c.employee, c.supervisor, CONCAT(cp.path, ' > ', c.supervisor)
    FROM category_path AS cp JOIN emp_super AS c
      ON cp.employee = c.supervisor
)
SELECT * FROM category_path
ORDER BY path;
