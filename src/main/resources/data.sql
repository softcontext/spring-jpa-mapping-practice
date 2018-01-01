
--ONE 2 ONE
------------------------------------------------------------------
--INSERT INTO member(username) values('AA');
--INSERT INTO member(username) values('AB');
--INSERT INTO member(username) values('BA');
--INSERT INTO member(username) values('BB');
--
--INSERT INTO locker(name, member_id) values('X1', 1);
--INSERT INTO locker(name, member_id) values('X2', 2);
--INSERT INTO locker(name, member_id) values('Y1', 3);
--INSERT INTO locker(name, member_id) values('Y2', 4);


--MANY 2 ONE
------------------------------------------------------------------
--INSERT INTO team(name) values('TEAM1');
--INSERT INTO team(name) values('TEAM2');
--
--INSERT INTO member(username, team_id) values('AA', 1);
--INSERT INTO member(username, team_id) values('AB', 1);
--INSERT INTO member(username, team_id) values('BA', 2);
--INSERT INTO member(username, team_id) values('BB', 2);


--MANY 2 MANY : @JoinTable
------------------------------------------------------------------
--INSERT INTO member(username) values('AA');
--INSERT INTO member(username) values('AB');
--INSERT INTO member(username) values('BA');
--INSERT INTO member(username) values('BB');
--
--INSERT INTO product(name) values('PRODUCT1');
--INSERT INTO product(name) values('PRODUCT2');
--INSERT INTO product(name) values('PRODUCT3');
--INSERT INTO product(name) values('PRODUCT4');
--
--INSERT INTO member_product(member_id, product_id) values(1, 1);
--INSERT INTO member_product(member_id, product_id) values(2, 2);
--INSERT INTO member_product(member_id, product_id) values(3, 3);
--INSERT INTO member_product(member_id, product_id) values(4, 4);
--INSERT INTO member_product(member_id, product_id) values(1, 2);
--INSERT INTO member_product(member_id, product_id) values(1, 3);
--INSERT INTO member_product(member_id, product_id) values(1, 4);


--MANY 2 MANY : @IdClass
------------------------------------------------------------------
--INSERT INTO member(username) values('AA');
--INSERT INTO member(username) values('AB');
--INSERT INTO member(username) values('BA');
--INSERT INTO member(username) values('BB');
--
--INSERT INTO product(name) values('PRODUCT1');
--INSERT INTO product(name) values('PRODUCT2');
--INSERT INTO product(name) values('PRODUCT3');
--INSERT INTO product(name) values('PRODUCT4');
--
--INSERT INTO member_product(member_id, product_id, order_amount, order_date) values(1, 1, 1, CURRENT_TIMESTAMP());
--INSERT INTO member_product(member_id, product_id, order_amount, order_date) values(2, 2, 1, CURRENT_TIMESTAMP());
--INSERT INTO member_product(member_id, product_id, order_amount, order_date) values(3, 3, 1, CURRENT_TIMESTAMP());
--INSERT INTO member_product(member_id, product_id, order_amount, order_date) values(4, 4, 1, CURRENT_TIMESTAMP());
--INSERT INTO member_product(member_id, product_id, order_amount, order_date) values(1, 2, 2, CURRENT_TIMESTAMP());
--INSERT INTO member_product(member_id, product_id, order_amount, order_date) values(1, 3, 3, CURRENT_TIMESTAMP());
--INSERT INTO member_product(member_id, product_id, order_amount, order_date) values(1, 4, 4, CURRENT_TIMESTAMP());


--MANY 2 MANY : @EmbeddedId, @Embeddable
------------------------------------------------------------------
--INSERT INTO member(username) values('AA');
--INSERT INTO member(username) values('AB');
--INSERT INTO member(username) values('BA');
--INSERT INTO member(username) values('BB');
--
--INSERT INTO product(name) values('PRODUCT1');
--INSERT INTO product(name) values('PRODUCT2');
--INSERT INTO product(name) values('PRODUCT3');
--INSERT INTO product(name) values('PRODUCT4');
--
--INSERT INTO member_product(member_id, product_id, order_amount, order_date) values(1, 1, 1, CURRENT_TIMESTAMP());
--INSERT INTO member_product(member_id, product_id, order_amount, order_date) values(2, 2, 1, CURRENT_TIMESTAMP());
--INSERT INTO member_product(member_id, product_id, order_amount, order_date) values(3, 3, 1, CURRENT_TIMESTAMP());
--INSERT INTO member_product(member_id, product_id, order_amount, order_date) values(4, 4, 1, CURRENT_TIMESTAMP());
--INSERT INTO member_product(member_id, product_id, order_amount, order_date) values(1, 2, 2, CURRENT_TIMESTAMP());
--INSERT INTO member_product(member_id, product_id, order_amount, order_date) values(1, 3, 3, CURRENT_TIMESTAMP());
--INSERT INTO member_product(member_id, product_id, order_amount, order_date) values(1, 4, 4, CURRENT_TIMESTAMP());


--MANY 2 MANY : surrogate key
------------------------------------------------------------------
--INSERT INTO member(username) values('AA');
--INSERT INTO member(username) values('AB');
--INSERT INTO member(username) values('BA');
--INSERT INTO member(username) values('BB');
--
--INSERT INTO product(name) values('PRODUCT1');
--INSERT INTO product(name) values('PRODUCT2');
--INSERT INTO product(name) values('PRODUCT3');
--INSERT INTO product(name) values('PRODUCT4');
--
--INSERT INTO member_product(member_id, product_id, order_amount, order_date) values(1, 1, 1, CURRENT_TIMESTAMP());
--INSERT INTO member_product(member_id, product_id, order_amount, order_date) values(2, 2, 1, CURRENT_TIMESTAMP());
--INSERT INTO member_product(member_id, product_id, order_amount, order_date) values(3, 3, 1, CURRENT_TIMESTAMP());
--INSERT INTO member_product(member_id, product_id, order_amount, order_date) values(4, 4, 1, CURRENT_TIMESTAMP());
--INSERT INTO member_product(member_id, product_id, order_amount, order_date) values(1, 2, 2, CURRENT_TIMESTAMP());
--INSERT INTO member_product(member_id, product_id, order_amount, order_date) values(1, 3, 3, CURRENT_TIMESTAMP());
--INSERT INTO member_product(member_id, product_id, order_amount, order_date) values(1, 4, 4, CURRENT_TIMESTAMP());


--Super-type Sub-type : Joined Strategy
------------------------------------------------------------------
--INSERT INTO item(name, price, dtype) values('ALBUM X', 10000, 'A');
--INSERT INTO item(name, price, dtype) values('MOVIE Y', 8000, 'M');
--
---- item_id is PK and FK
--INSERT INTO album(item_id, artist) values(1, 'ARTIST X');
--INSERT INTO movie(item_id, director, actor) values(2, 'DIRECTOR Y', 'ACTOR Y');


--Super-type Sub-type : Single-table Strategy
------------------------------------------------------------------
--INSERT INTO item(name, price, dtype, artist, director, actor) values('ALBUM X', 10000, 'A', 'ARTIST X', null, null);
--INSERT INTO item(name, price, dtype, artist, director, actor) values('MOVIE Y', 8000, 'M', null, 'DIRECTOR Y', 'ACTOR Y');


--@MappedSuperclass
------------------------------------------------------------------
--INSERT INTO member(member_name, email) values('MEMBER X', 'EMAIL X');
--INSERT INTO seller(seller_name, shop_name) values('SELLER Y', 'SHOP Y');


--Non Identifying Relationship : @IdClass
------------------------------------------------------------------
--INSERT INTO parent(parent_id1, parent_id2, name) values(1, 100, 'PARENT X');
--INSERT INTO child(parent_id1, parent_id2, name) values(1, 100, 'CHILD X');


--Non Identifying Relationship : @EmbeddedId, @Embeddable
------------------------------------------------------------------
--INSERT INTO parent(parent_id1, parent_id2, name) values(1, 100, 'PARENT X');
--INSERT INTO child(parent_id1, parent_id2, name) values(1, 100, 'CHILD X');


--Identifying Relationship : @IdClass
------------------------------------------------------------------
--INSERT INTO parent(parent_id1, parent_id2, name) values(1, 100, 'PARENT X');
--INSERT INTO child(child_id, parent_id1, parent_id2, name) values(1, 1, 100, 'CHILD X');


--Identifying Relationship : @EmbeddedId, @Embeddable
------------------------------------------------------------------
--INSERT INTO parent(parent_id1, parent_id2, name) values(1, 100, 'PARENT X');
--INSERT INTO child(child_id, parent_id1, parent_id2, name) values(1, 1, 100, 'CHILD X');


--Recursive Relationship
------------------------------------------------------------------
--INSERT INTO DEPT(deptno, dname, loc) VALUES (10,'ACCOUNTING','NEW YORK');
--INSERT INTO DEPT(deptno, dname, loc) VALUES (20,'RESEARCH','DALLAS');
--INSERT INTO DEPT(deptno, dname, loc) VALUES (30,'SALES','CHICAGO');
--INSERT INTO DEPT(deptno, dname, loc) VALUES (40,'OPERATIONS','BOSTON');
----대표
--INSERT INTO EMP(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(7839,'KING','PRESIDENT', NULL,PARSEDATETIME('17-11-1981','dd-MM-yyyy','en'),5000,NULL,10);
----그룹장
--INSERT INTO EMP(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(7566,'JONES','MANAGER',  7839,PARSEDATETIME('2-4-1981',  'dd-MM-yyyy','en'),2975,NULL,20);
--INSERT INTO EMP(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(7698,'BLAKE','MANAGER',  7839,PARSEDATETIME('1-5-1981',  'dd-MM-yyyy','en'),2850,NULL,30);
--INSERT INTO EMP(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(7782,'CLARK','MANAGER',  7839,PARSEDATETIME('9-6-1981',  'dd-MM-yyyy','en'),2450,NULL,10);
----팀장
--INSERT INTO EMP(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(7902,'FORD','ANALYST',   7566,PARSEDATETIME('3-12-1981', 'dd-MM-yyyy','en'),3000,NULL,20);
--INSERT INTO EMP(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(7788,'SCOTT','ANALYST',  7566,PARSEDATETIME('13-07-1987', 'dd-MM-yyyy','en'),3000,NULL,20);
--INSERT INTO EMP(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(7499,'ALLEN','SALESMAN', 7698,PARSEDATETIME('20-2-1981', 'dd-MM-yyyy','en'),1600,300,30);
--INSERT INTO EMP(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(7521,'WARD','SALESMAN',  7698,PARSEDATETIME('22-2-1981', 'dd-MM-yyyy','en'),1250,500,30);
--INSERT INTO EMP(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(7654,'MARTIN','SALESMAN',7698,PARSEDATETIME('28-9-1981', 'dd-MM-yyyy','en'),1250,1400,30);
--INSERT INTO EMP(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(7844,'TURNER','SALESMAN',7698,PARSEDATETIME('8-9-1981',  'dd-MM-yyyy','en'),1500,0,30);
--INSERT INTO EMP(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(7900,'JAMES','CLERK',    7698,PARSEDATETIME('3-12-1981', 'dd-MM-yyyy','en'),950,NULL,30);
--INSERT INTO EMP(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(7934,'MILLER','CLERK',   7782,PARSEDATETIME('23-1-1982', 'dd-MM-yyyy','en'),1300,NULL,10);
----팀원
--INSERT INTO EMP(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(7369,'SMITH','CLERK',    7902,PARSEDATETIME('17-12-1980','dd-MM-yyyy','en'),800,NULL,20);
--INSERT INTO EMP(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(7876,'ADAMS','CLERK',    7788,PARSEDATETIME('13-07-1987', 'dd-MM-yyyy','en'),1100,NULL,20);




