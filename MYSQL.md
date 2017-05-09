MYSQL


5.2 查询所有学生记录，按年龄降序排序

SELECT *FROM stu ORDER BY age DESC;


5.3 查询所有雇员，按月薪降序排序，如果月薪相同时，按编号升序排序 

SELECT * FROM emp ORDER BY sal DESC,empno ASC;

6 聚合函数

聚合函数是用来做纵向运算的函数：

? COUNT()：统计指定列不为NULL的记录行数；

? MAX()：计算指定列的最大值，如果指定列是字符串类型，那么使用字符串排序运算； ? MIN()：计算指定列的最小值，如果指定列是字符串类型，那么使用字符串排序运算； ? SUM()：计算指定列的数值和，如果指定列类型不是数值类型，那么计算结果为0； ? AVG()：计算指定列的平均值，如果指定列类型不是数值类型，那么计算结果为0；

6.1 COUNT

当需要纵向统计时可以使用COUNT()。

? 查询emp表中记录数：

	SELECT COUNT(*) AS cnt FROM emp;

? 查询emp表中有佣金的人数：

	SELECT COUNT(comm) cnt FROM emp;

注意，因为count()函数中给出的是comm列，那么只统计comm列非NULL的行数。

? 查询emp表中月薪大于2500的人数：

	SELECT COUNT(*) FROM empWHERE sal > 2500;

? 统计月薪与佣金之和大于2500元的人数：

	SELECT COUNT(*) AS cnt FROM emp WHERE sal+IFNULL(comm,0) > 2500;

? 查询有佣金的人数，以及有领导的人数：

	SELECT COUNT(comm), COUNT(mgr) FROM emp;

6.2 SUM和AVG 当需要纵向求和时使用sum()函数。

? 查询所有雇员月薪和：

	SELECT SUM(sal) FROM emp;

? 查询所有雇员月薪和，以及所有雇员佣金和：

	SELECT SUM(sal), SUM(comm) FROM emp;

? 查询所有雇员月薪+佣金和：

	SELECT SUM(sal+IFNULL(comm,0)) FROM emp;

? 统计所有员工平均工资：

	SELECT SUM(sal), COUNT(sal) FROM emp;
或者
	SELECT AVG(sal) FROM emp;

6.3 MAX和MIN

? 查询最高工资和最低工资：

	SELECT MAX(sal), MIN(sal) FROM emp;

7 分组查询

当需要分组查询时需要使用GROUP BY子句，例如查询每个部门的工资和，这说明要使用部分来分组。

7.1 分组查询

? 查询每个部门的部门编号和每个部门的工资和：

	SELECT deptno, SUM(sal) FROM emp GROUP BY deptno;

? 查询每个部门的部门编号以及每个部门的人数：

	SELECT deptno,COUNT(*) FROM emp GROUP BY deptno;

? 查询每个部门的部门编号以及每个部门工资大于1500的人数：

	SELECT deptno,COUNT(*) FROM emp WHERE sal>1500 GROUP BY deptno;

7.2 HAVING子句

? 查询工资总和大于9000的部门编号以及工资和：

	SELECT deptno, SUM(sal) FROM emp GROUP BY deptno HAVING SUM(sal) > 9000;

注意，WHERE是对分组前记录的条件，如果某行记录没有满足WHERE子句的条件，那么这行记录不会参加分组；而HAVING是对分组后数据的约束。

8 LIMIT

LIMIT用来限定查询结果的起始行，以及总行数。

8.1 查询5行记录，起始行从0开始

	SELECT * FROM emp LIMIT 0, 5;

注意，起始行从0开始，即第一行开始！

8.2 查询10行记录，起始行从3开始

	SELECT * FROM emp LIMIT 3, 10;

8.3 分页查询

如果一页记录为10条，希望查看第3页记录应该怎么查呢？

? 第一页记录起始行为0，一共查询10行；

? 第二页记录起始行为10，一共查询10行；

? 第三页记录起始行为20，一共查询10行；

完整性约束

完整性约束是为了表的数据的正确性！如果数据不正确，那么一开始就不能添加到表中。

1 主键 当某一列添加了主键约束后，那么这一列的数据就不能重复出现。这样每行记录中其主键列的值就是这一行的唯一标识。例如学生的学号可以用来做唯一标识，而学生的姓名是不能做唯一标识的，因为学习有可能同名。

主键列的值不能为NULL，也不能重复！

指定主键约束使用PRIMARY KEY关键字 (primary key);

? 创建表：定义列时指定主键：

	CREATE TABLE stu( 
		sid CHAR(6) PRIMARY KEY, 
		sname VARCHAR(20), age INT, 
		gender VARCHAR(10)
	 );

? 创建表：定义列之后独立指定主键：
 
	CREATE TABLE stu( 
		sid CHAR(6), 
		sname VARCHAR(20),
		age INT,
		gender VARCHAR(10),
		PRIMARY KEY(sid)
	);

? 修改表时指定主键：

	ALTER TABLE stu ADD PRIMARY KEY(sid);

? 删除主键（只是删除主键约束，而不会删除主键列）：

	ALTER TABLE stu DROP PRIMARY KEY;
2 主键自增长

MySQL提供了主键自动增长的功能！这样用户就不用再为是否有主键是否重复而烦恼了。当主键设置为自动增长后，在没有给出主键值时，主键的值会自动生成，而且是最大主键值+1，也就不会出现重复主键的可能了。

? 创建表时设置主键自增长（主键必须是整型才可以自增长）：

	CREATE TABLE stu(
		sid INT PRIMARY KEY AUTO_INCREMENT,
		sname VARCHAR(20),
		age INT,
		gender VARCHAR(10)
	);

 ? 修改表时设置主键自增长：

	ALTER TABLE stu CHANGE sid sid INT AUTO_INCREMENT;

 ? 修改表时删除主键自增长：

	ALTER TABLE stu CHANGE sid sid INT;

3 非空

指定非空约束的列不能没有值，也就是说在插入记录时，对添加了非空约束的列一定要给值；在修改记录时，不能把非空列的值设置为NULL。(int primary key auto_incement); ? 指定非空约束：

	CREATE TABLE stu(
		sid INT PRIMARY KEY AUTO_INCREMENT,
		sname VARCHAR(10) NOT NULL,
		age INT,
		gender VARCHAR(10)
	);

当为sname字段指定为非空后，在向stu表中插入记录时，必须给sname字段指定值，否则会报错：

	INSERT INTO stu(sid) VALUES(1);

插入的记录中sname没有指定值，所以会报错！

4 唯一

还可以为字段指定唯一约束！当为字段指定唯一约束后，那么字段的值必须是唯一的。这一点与主键相似！例如给stu表的sname字段指定唯一约束：

	CREATE TABLE tab_ab(
		sid INT PRIMARY KEY AUTO_INCREMENT,
		sname VARCHAR(10) UNIQUE
	);
	INSERT INTO sname(sid, sname) VALUES(1001, 'zs');
	INSERT INTO sname(sid, sname) VALUES(1002, 'zs');

当两次插入相同的名字时，MySQL会报错！

5 外键

主外键是构成表与表关联的唯一途径！

外键是另一张表的主键！
	constraint 外键名（自己定义） foreign key 字段名1 references 主表名（主键1）

