CREATE TABLE student(
	no int AUTO_INCREMENT PRIMARY KEY, 
	age varchar(10),
	name varchar(100),
	studentNum varchar(4)	
)

CREATE TABLE professor(
	no int AUTO_INCREMENT PRIMARY KEY, 
	age varchar(10),
	name varchar(100),
	subject varchar(100)	
)

CREATE TABLE manage(
	no int AUTO_INCREMENT PRIMARY KEY, 
	age varchar(10),
	name varchar(100),
	part varchar(100)	
)

DROP TABLE manager
