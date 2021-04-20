
CREATE TABLE student(

	no number(5) primary key,
	age varchar2(5),
	name varchar2(100),
	studentNum varchar(5)
)

CREATE TABLE professor(
	no number(5) primary key,
	age varchar2(5),
	name varchar2(100),
	subject varchar2(100)
)

CREATE TABLE manage(
	no number(5) primary key,
	age varchar2(5),
	name varchar2(100),
	part varchar2(100)
