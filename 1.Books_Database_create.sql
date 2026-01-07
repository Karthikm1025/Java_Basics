CREATE TABLE authors(
	authorId int  NOT NULL,
	name varchar (50) NULL,
	surname varchar(70) NULL,
  PRIMARY KEY(authorId));
 
 


CREATE TABLE books(
	bookId int NOT NULL,
	name varchar(90) NULL,
	pagecount int NULL,
	point int NULL,
	authorId int NULL,
	typeId int NULL,
 CONSTRAINT PK_books PRIMARY KEY (bookId));
 
 CREATE TABLE borrows(
	borrowId int NOT NULL,
	studentId int NULL,
	bookId int NULL,
	takenDate date NULL,
	broughtDate date NULL,
 CONSTRAINT PK_borrows PRIMARY KEY (borrowId));


CREATE TABLE students(
	studentId int NOT NULL,
	name varchar(20) NULL,
	surname varchar(20) NULL,
	birthdate date NULL,
	gender varchar(10) NULL,
	class varchar(7) NULL,
	point int NULL,
CONSTRAINT PK_students PRIMARY KEY (studentId));

CREATE TABLE types(
	typeId int NOT NULL,
	name varchar(30) NULL,
constraint PK_types PRIMARY KEY(typeId));
