
create database studentdb;

use studentdb;

create table departments
(
	dept_id int primary key,
	dept_name varchar(35)
);

create table students
(
	student_id int primary key,
	student_name varchar(35),
	student_score float,
	dept_id int
);

Alter table students
Add constraint dept_id_fk foreign key(dept_id)
References departments(dept_id);

insert into departments 
values
	(10, 'IT'),
    (20, 'CM'),
    (30, 'ME');
commit;    

select * from departments;
select * from students;


