DROP TABLE student;


CREATE TABLE student(
 no int auto_increment primary key,
 age VARCHAR(10),
 name VARCHAR(100),
 studentNum VARCHAR(100) 
);


CREATE TABLE professor(
 no int auto_increment primary key,
 age VARCHAR(10),
 name VARCHAR(100),
 subject VARCHAR(100)
);

CREATE TABLE manage(
 no int auto_increment primary key,
 age VARCHAR(10),
 name VARCHAR(100),
 part VARCHAR(100)
);

select * from student
select * from professor
select * from manage

ALTER TABLE student convert to charset utf8;

ALTER TABLE manage convert to charset utf8;