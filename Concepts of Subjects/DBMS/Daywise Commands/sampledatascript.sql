  create table dept ( deptid int primary key , deptname varchar(10));


  create table emp ( eid int  , ename varchar(20) , salary int , deptid int ,
foreign key (deptid) references dept(deptid));



  insert into dept values (1 , 'HR');
  insert into dept values (2, 'IT');
  insert into dept values (3, 'Finance'); 


   insert into emp values (1,'a',1000,1);
   insert into emp values (2,'b' , 1023 , 2);
   insert into emp values (3,'c' , 23 , 3);
   insert into emp values (4,'d' , 123 , 3);
   insert into emp values (5,'e' , 102 , 1);
   insert into emp values (6,'f' , 2023 , 3);
   insert into emp values (7,'g' , 323 , 1);
   insert into emp values (8,'h' , 523 , 2);
   insert into emp values (9,'i' , 136 , 1);
   insert into emp values (10,'j', 627 , 1);
   insert into emp values (11,'k' , 978 , 3);
   insert into emp values (12,'l' , 222 , 1);
   insert into emp values (13,'m' , 746 , 1);
   insert into emp values (14,'n' , 3223 , 1);
   insert into emp values (15,'o' , 1999 , 3);
   insert into emp values (16,'p' , 821 , 3);
   insert into emp values (17,'q' , 324 , 1);
   insert into emp values (18,'r' , 546 , 3);
   insert into emp values (19,'s' , 717 , 2);
   insert into emp values (20,'t' , 817 , 2);
   insert into emp values (21,'u' , 888 , 3);
   insert into emp values (22,'v' , 9029 , 1);
   insert into emp values (23,'w' , 20001 , 3);
   insert into emp values (24,'x' , 28222 , 1);
   insert into emp values (25,'y' , 19212 , 3);
   insert into emp values (26,'z' , 12111 , 1);
   insert into emp values (27,'a1' , 3211 , 1);
   insert into emp values (28,'a2' , 9238 , 1);
   insert into emp values (29,'a3' , 653 , 3);
   insert into emp values (30,'a4' , 44 , 1);
   insert into emp values (31,'a5' , 3 , 2);
   insert into emp values (32,'a6' , 16 , 1);
   insert into emp values (33,'a7' , 14 , 2);
   insert into emp values (34,'a8' , 845 , 1);
   insert into emp values (35,'a9' , 135 , 3);
   insert into emp values (36,'b1' , 1212 , 1);
   insert into emp values (37,'b2' , 1242 , 2);
   insert into emp values (38,'b3' , 4212 , 2);
   insert into emp values (39,'b4' , 4444 , 3);
   insert into emp values (40,'b5' , 555 , 1);
   insert into emp values (41,'b6' , 1553 , 3);
   insert into emp values (42,'b7' , 6432 , 1);
   insert into emp values (43,'b8' , 4532 , 2);
   insert into emp values (44,'b9' , 3355 , 1);
   insert into emp values (45,'c1' , 2324 , 2);


