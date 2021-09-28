SELECT * FROM salespeople;
SELECT * FROM customers WHERE rating = 100;
SELECT * FROM customers WHERE city IS NULL;
SELECT odate AS Date, snum AS sID, MAX(amt) AS Max FROM orders GROUP BY odate;
SELECT * FROM customers ORDER BY cnum DESC;
SELECT DISTINCT o.snum, sname  FROM orders o, salespeople s WHERE o.snum=s.snum;
SELECT cname, sname FROM customers c, salespeople s WHERE c.snum=s.snum;
select c.snum, sname, count(c.cnum) AS ccount FROM customers c, salespeople s WHERE s.snum=c.snum GROUP BY c.snum HAVING ccount>1;
SELECT snum, COUNT(onum) AS ordercount FROM orders GROUP BY snum ORDER BY ordercount DESC;
SELECT * from customers WHERE (SELECT COUNT(*) FROM customers WHERE city='San Jose')>1;
SELECT sname, cname, c.city FROM salespeople s, customers c WHERE s.snum=c.snum AND s.city=c.city;
SELECT snum, MAX(amt) AS Max FROM orders GROUP BY snum;
SELECT * FROM customers WHERE city='San Jose' AND rating>200;
SELECT sname, comm FROM salespeople WHERE city='London';
SELECT * FROM orders o, salespeople s WHERE o.snum=s.snum AND sname='Motika';
SELECT cname FROM customers WHERE cnum IN (SELECT cnum FROM orders WHERE odate='1996-10-03');
SELECT SUM(amt) AS total, odate FROM orders GROUP BY odate HAVING SUM(amt) > MAX(amt)+2000;
SELECT * FROM orders WHERE amt > ANY (SELECT amt from orders WHERE odate='1996-10-06');
SELECT * FROM salespeople s WHERE EXISTS (SELECT snum FROM customers  AS c WHERE s.snum=c.snum AND rating=300);
SELECT c1.cname, c1.rating, c2.cname FROM customers c1, customers c2 WHERE c1.rating=c2.rating AND c1.cname<c2.cname;
SELECT * FROM customers WHERE cnum > (SELECT snum+1000 from salespeople WHERE sname='Serres');
SELECT sname, CONCAT(floor(comm*100),' %') AS Commission from salespeople;
SELECT snum, odate, MAX(amt) AS maxim FROM orders GROUP BY snum, odate HAVING MAX(amt) > 3000;
SELECT snum, odate, MAX(amt) AS Max FROM orders WHERE odate='1996-10-03' GROUP BY SNUM;
SELECT city FROM customers WHERE city IN  (SELECT city FROM customers WHERE snum=1002);
SELECT * FROM customers WHERE rating>200;
SELECT count(DISTINCT snum) FROM orders;
SELECT cname, comm FROM salespeople s, customers c WHERE c.snum=s.snum AND comm>0.12;
SELECT o.snum, sname, COUNT(o.cnum) AS CustCount FROM orders o, salespeople s WHERE o.snum=s.snum GROUP BY snum HAVING COUNT(cnum)>1;
SELECT sname, s.city, cname FROM salespeople s, customers c WHERE s.city=c.city ORDER BY sname;
select sname from salespeople where sname like 'P__l';
select * from orders where cnum = (select cnum from customers where cname='Cisneros');
select sname, max(amt) from orders o, salespeople s where s.snum=o.snum and o.snum in (select snum from salespeople where sname in ('Serres', 'Rifkin')) group by o.snum;
select snum, sname, comm, city from salespeople;
select * from customers where cname>='a' and cname <'h';
select sname, cname from salespeople, customers;
select * from orders where amt > (select avg(amt) from orders where odate='1996-10-04');
select cnum, cname from customers c where rating = ( select max(rating) from customers c2 where c.city = c2.city);
select odate, sum(amt) from orders group by odate order by 2 desc;
select rating, cname from customers where city='san jose';
Select onum, amt from orders where amt< any ( select amt from orders o, customers c where city='San Jose' and o.cnum = c.cnum);
select onum, cnum, amt from orders o where amt> (select avg(amt) from orders o2 where o.cnum = o2.cnum group by cnum);
select city, max(rating) from customers group by city;
select o.onum ,amt, sname, amt*comm as Commission from salespeople s, customers c, orders o where rating>100 and o.cnum=c.cnum and o.snum=s.snum;
select count(cnum) from customers where rating > (select avg(rating) from customers where city='san jose');
(select s1.sname, s2.sname from salespeople s1, salespeople s2 where s1.snum=s2.snum) union all (select s1.sname, s2.sname from salespeople s1, salespeople s2 where s1.snum=s2.snum);
select * from salespeople where city in ('barcelona', 'london');
select snum from customers group by snum having count(snum)=1;
select c1.cname, c2.cname, c1.snum from customers c1, customers c2 where c1.cname<>c2.cname and c1.snum=c2.snum limit 2;
select * from orders where amt> 1000;
select o.onum, cname from customers c, orders o where o.cnum=c.cnum order by onum asc;
select distinct s.snum, sname from salespeople s, customers c where s.city=c.city and s.snum<>c.snum;
select * from customers where rating>=(select min(rating) from customers c , salespeople s where c.snum=s.snum and sname='Serres'); #OR select * from customers where rating >= any (select rating from customers where snum = (select snum from salespeople where sname='serres'));
select * from orders where odate in ('1996-10-03','1996-10-04'); #select * from orders where odate between '1996-10-03' and '1996-10-04';
select o.cnum, cname, onum from orders o, customers c where  o.cnum=c.cnum order by o.cnum asc;
select * from customers where rating > all (select rating from customers where city='rome');
select * from customers where rating>100 or city='rome';
select * from customers where snum=1001;
select snum, sum(amt) from orders group by snum having sum(amt) > (select max(amt) from orders);
select * from orders where amt is null;
select sname, cname from salespeople, customers where ascii(sname)<ascii(cname) and rating<200;
select sname, round(sum(amt*comm), 2) as Earning from salespeople s, orders o where s.snum=o.snum group by sname; #OR select s.sname, round(t1.Osum*s.comm, 2) as Earning from salespeople s, (select snum, sum(amt) as Osum from orders group by snum) as t1 where s.snum=t1.snum;
select cname, city from customers where rating=(select rating from customers where cnum=2001) and cnum<>2001;
select sname, cname from salespeople s, customers c where s.snum=c.snum and ascii(sname)<ascii(cname);
select cname, rating from customers where cnum in (select distinct cnum from orders where amt>(select avg(amt) from orders));
select sum(amt) from orders;
select onum, amt, odate from orders;
select count(rating) from customers where rating is not null;
select onum, sname, cname from orders o, customers c, salespeople s where o.cnum=c.cnum and o.snum=s.snum;
select comm from salespeople where snum = (select distinct  snum from customers where city='london');
select * from salespeople where city <> all (select city from customers);
select * from salespeople s where exists (select c.snum from customers c where c.snum<>s.snum and c.city=s.city);
select * from customers where snum in (select snum from salespeople where sname='peel' or sname='motika');
select odate, count(distinct snum) from orders group by odate;
select * from orders where snum in (select snum from salespeople where city='london');
select * from orders where  cnum in (select c.cnum from customers c, salespeople s where c.snum=s.snum and c.city<>s.city); # OR select o.onum, c.city, s.city from orders o, salespeople s, customers c where c.city<>s.city and o.snum=s.snum and o.cnum=c.cnum;
select * from salespeople where snum in (select snum from orders group by cnum having count(onum)>1);
select distinct c.cnum, cname, sname from customers c, orders o, salespeople s where s.snum=c.snum and s.snum=o.snum and c.cnum<>o.cnum;
select * from customers where cname like 'c%';
SELECT sname, CONCAT(floor(comm*100),' %') AS Commission from salespeople;
select concat('Highest rating of ',city,' is ' , max(rating)) as  Ratings from customers group by city;
select rating, cname, cnum from customers order by rating desc;
select city, round(avg(comm),2) as Comm from salespeople where city='london';
select * from orders where snum =(select snum from customers where cnum=2001);
select * from salespeople where comm>=0.10 and comm<=0.12;
select sname, city from salespeople where city='london' and comm>0.10;
SELECT * FROM ORDERS where (amt < 1000 OR NOT (odate = 10/03/1996 AND cnum > 2003)); #gives whole order table
select cnum, min(amt) from orders group by cnum;
select cname from customers where cname like 'g%' order by cname limit 1;
select count(distinct city) from customers where city is not null;
select round(avg(amt), 2) from orders;
SELECT * FROM ORDERS WHERE odate<> '1996-10-03' AND snum<=1006 AND amt >= 1500;
select * from customers where city<>'san jose' and rating>200;
SELECT * FROM salespeople;
SELECT * FROM orders WHERE NOT ((odate = 10/03/96 AND snum > 1002) OR amt > 2000.00);
select sname, s.city, cname, c.city from salespeople s, customers c where s.city<>c.city and s.snum=c.snum;
select * from salespeople where comm>0.11 and snum in (select snum from customers where rating<250);
select s1.sname, s1.comm, s2.sname, s2.comm from salespeople s1, salespeople s2 where s1.snum<s2.snum and s1.city=s2.city and s1.comm<>s2.comm;
select sname, sum(amt*comm) tcomm from orders o, salespeople s where o.snum=s.snum group by sname order by tcomm desc limit 1;
select cname, count(onum) from customers c, orders o where o.cnum=c.cnum group by cname order by 2 desc;
select o.cnum, sum(amt), rating from orders o, customers c where o.cnum=c.cnum group by o.cnum order by sum(amt) desc limit 1;
select * from customers order by rating desc;
select odate from orders where cnum =(select cnum from customers where cname='hoffman');
select count(comm), count(distinct comm) from salespeople;
select sname from salespeople where snum not in (select distinct snum from orders where odate>='1996-10-03' and odate<='1996-10-05');
select distinct o.snum, s.sname from orders o, salespeople s where o.snum=s.snum; #OR select sname from salespeople where snum in (select distinct snum from orders o);
select count(distinct cnum) from orders;
select snum, odate, max(amt) from orders group by snum;
select s.snum, sname, sum(amt*comm) tcomm from orders o, salespeople s where o.snum=s.snum group by sname order by tcomm desc limit 1;
select o.cnum, cname, sum(amt) from orders o, customers c where o.cnum=c.cnum group by cnum order by sum(amt) limit 1;
select cname, sum(amt) from orders o, customers c where o.cnum=c.cnum group by o.cnum order by sum(amt); #NO, bcaz totall all orders are > 200
select c1.cname, c2.cname from customers c1, customers c2 where c1.rating=c2.rating and c1.cnum<>c2.cnum;
select * from orders where amt > (select avg(amt) from orders where odate='1996-10-04');
select t1.cnum, spent, cname from (select cnum, sum(amt) as spent from orders group by cnum) t1, customers c where t1.cnum=c.cnum and spent>(select avg(amt) from orders);
select * from customers where rating > (select avg(rating) from customers where city='san jose');
select cnum, spent from (select cnum, sum(amt) as spent from orders group by cnum) t1 where spent>(select max(amt) from orders);
select snum, sname from salespeople where snum in (select snum from customers group by snum having count(snum)>1);
select distinct s.snum, s.sname from salespeople s, customers c where c.city=s.city and c.snum<>s.snum;
select o.cnum, c.cname, sum(o.amt) from orders o, customers c where c.cnum=o.cnum group by o.cnum order by sum(o.amt) limit 1;
select snum from customers where city='berlin';
select o.snum, round(sum(amt),2) as Earning, concat(floor(comm*100),' %') as Commission from orders o, salespeople s where o.snum=s.snum group by o.snum order by Earning;
#122
select case when c_amt > s_comm*5 then 'Yes' else 'No' end Answer
from (select sum(amt) c_amt from orders o, customers c where o.cnum=c.cnum and c.city in ('Rome','London')) t1,
(select sum(amt*comm) s_comm from orders o, salespeople s where s.snum=o.snum and s.city in ('New York','London')) t2;
#OR  122
select case when sum(case when c.city in ('Rome', 'London') then amt else 0 end) >
sum(case when s.city in ('London','New York') then amt*comm else 0 end) * 5 then 'Yes' 
else 'No' end total_amt_exceeds_5_times_comm
from orders o , customers c, salespeople s where o.cnum=c.cnum and c.snum=s.snum and o.snum=s.snum;

#123
select o.odate, o.onum, max(o.amt), c.city, s.sname from orders o, salespeople s, customers c where o.snum=s.snum and o.cnum=c.cnum group by o.snum;
#124
select sname, comm from salespeople where snum not in (select distinct snum from orders); #we can further compare by commission rate and fire the highest one if required.
#125
select Gross, TotalComm, Gross-TotalComm as NET from (select sum(o.amt) as Gross, round(sum(o.amt*s.comm), 2) as TotalComm from salespeople s, orders o where s.snum=o.snum) as t1; #sum of amt - total comm = net income

#----------------extras---------------------------------
#Display names of dept and their maximum salary, whose avg salary is greater than min salary of hr dept
select deptname, max(salary) from emp e, dept d where d.deptid=e.deptid group by deptname having avg(salary) >
(select min(salary) from emp where deptid=(select deptid from dept where deptname='HR'));