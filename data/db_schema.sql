create database sidegig;

use sidegig;


create table test_cat(id int primary key,
						abcde varchar(30),
						description varchar(30),
						created_timestamp timestamp,
                        modified_timestamp timestamp  DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP);


create table category(id int primary key,
						title varchar(30),
						description varchar(30),
						created_timestamp timestamp,
                        modified_timestamp timestamp  DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP);

-- set global sql_mode = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION';

-- show variables like 'sql_mode' ; 
										
create table product(id int primary key,
					name varchar(30),
					description varchar(50),
					price float,
					quantity int,
					category_id int,
					status varchar(20),
					created_timestamp timestamp,
					modified_timestamp timestamp  DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                    foreign key(category_id) references category(id));

-- drop table product;

-- drop table category;

-- alter table category modify id int;
                        
-- select * from category;

insert into category values (1, 'fruits', 'eatables', now(), now());
insert into category values (2, 'vegetables', 'eatables', now(), now());
insert into category values (3, 'dairy', 'eatables', now(), now());
insert into category values (4, 'meat', 'eatables', now(), now());
insert into category values (5, 'bread', 'eatables', now(), now());


--  fruits100 to 9,999

insert into product values (100, 'Apple', 'red apple', 1.10, 200, 1, 'available', now(), now());
insert into product values (200, 'banana', 'yellow bananas', 0.60, 200, 1, 'available', now(), now());
insert into product values (300, 'orange', 'orange', 0.55, 200, 1, 'available', now(), now());
insert into product values (400, 'water melon', 'green', 3.10, 200, 1, 'available', now(), now());
insert into product values (500, 'plum', 'plum', 0.20, 200, 1, 'available', now(), now());
insert into product values (600, 'blueberry', 'blue', 0.20, 200, 1, 'available', now(), now());
insert into product values (700, 'strawberry', 'red', 0.15, 200, 1, 'available', now(), now());
insert into product values (800, 'papaya', 'yellow', 4.50, 200,1, 'available', now(), now());
insert into product values (900, 'kiwi', 'brown', 1.25, 200, 1, 'available', now(), now());

-- veggies 10,000 to 19,999

insert into product values (10000, 'carrot', 'whole', 2.50, 100, 2, 'available', now(), now());
insert into product values (10100, 'beet root', 'red', 3.60, 320, 2, 'available', now(), now());
insert into product values (10200, 'cauliflower', 'white', 2.55, 120, 2, 'available', now(), now());
insert into product values (10300, 'cabbage', 'green', 3.10, 100, 2, 'available', now(), now());
insert into product values (10400, 'potato', 'brown', 2.30, 250, 2, 'available', now(), now());
insert into product values (10500, 'green beans', 'green', 3.50, 350, 2, 'available', now(), now());
insert into product values (10600, 'broccoli', 'green', 2.15, 200,2, 'available', now(), now());
insert into product values (10700, 'brinjal', 'blue', 4.50, 260, 2, 'available', now(), now());
insert into product values (10800, 'ladys finger', 'green', 4.25, 270, 2, 'available', now(), now());
insert into product values (10900, 'mushrooms', 'blue', 4.50, 270, 2, 'available', now(), now());
insert into product values (11100, 'onion', 'green', 2.25, 570, 2, 'available', now(), now());
insert into product values (11200, 'tomato', 'blue', 2.50, 407,2, 'available', now(), now());
insert into product values (11300, 'spinach', 'green', 3.25, 200, 2, 'available', now(), now());
insert into product values (11400, 'radish', 'blue', 3.30, 220, 2, 'available', now(), now());
insert into product values (11500, 'brussel sprouts', 'green', 2.25, 240, 2, 'available', now(), now());

-- Dairy 20,000 to 29,999


insert into product values (20000, 'milk', 'whole', 4.50, 500, 3, 'available', now(), now());
insert into product values (20100, 'eggs', 'red', 3.00, 1520, 3, 'available', now(), now());
insert into product values (20200, 'yoghurt', 'white', 2.00, 500, 3, 'available', now(), now());
insert into product values (20300, 'butter', 'green', 2.10, 500, 3, 'available', now(), now());
insert into product values (20400, 'cheese', 'brown', 2.50, 550, 3, 'available', now(), now());


-- Meat 30,000 to 39,999

insert into product values (30000, 'chicken', 'whole', 3.50, 500, 4, 'available', now(), now());
insert into product values (30100, 'turkey', 'red', 3.00, 1520, 4, 'available', now(), now());
insert into product values (30200, 'pork', 'white', 5.00, 500,4, 'available', now(), now());
insert into product values (30300, 'beef', 'green', 5.10, 500, 4, 'available', now(), now());
insert into product values (30400, 'fish', 'brown', 3.50, 550, 4, 'available', now(), now());
insert into product values (30500, 'shrimp', 'green', 3.10, 500, 4, 'available', now(), now());
insert into product values (30600, 'lamb', 'brown', 5.50, 550, 4, 'available', now(), now());

-- Bread 40,000 to 49,999

insert into product values (40000, 'white', 'whole', 3.50, 500, 5, 'available', now(), now());
insert into product values (40100, 'wheat', 'red', 4.50, 1520, 5, 'available', now(), now());
insert into product values (40200, 'whole grain', 'white', 5.00, 500, 5, 'available', now(), now());
insert into product values (40300, 'honey wheat', 'green', 4.10, 500, 5, 'available', now(), now());
insert into product values (40400, 'sandwich', 'brown', 3.50, 550, 5, 'available', now(), now());
insert into product values (40500, 'oat', 'green', 5.10, 500,5, 'available', now(), now());
insert into product values (40600, 'hawaiian', 'brown', 3.50, 550, 5, 'available', now(), now());


-- select * from product;
