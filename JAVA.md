JAVA -VERSION  
dir ------------------ 查看文件夹所有文件
cd ------------------- 进入一个地址
public --------------- 修饰符 公共的
class ---------------- 类 定义类
myfirstapp ----------- 类的名称 自定义
static --------------- 静态的
void ----------------- 无返回的
main ----------------- 方法名称 主函数 程序入口（参数）
String --------------- 数组
args ----------------- 参数名 自定义
prinft --------------- 输出语句

public class MyFirstapp{
	public static void main(String args[]){
		System.out.println("");
	}
}
----------------------------------------------------------------------------

int[] sa=new int[10] ---- 创建数组
if(){}else -------------- 条件判断（如果否则）

---------------------  多分支条件判断
switch(表达式){
case 常变量表达式：语句组；break；
default：语句；
}
---------------------

while(a=1)  do-while(a=1)  for(a=1；a<10；a++) ---- 循环语句
break --------跳出这个循环   continue ------------- 跳出本轮循环

---------------------创建数组的语法
一维数组的创建：
----使用new运算符：
------String[] str=new String[5]；
------int[] str=new int[5]；
----直接初始化数组：
------String[] str={"张三","李四"}；
------int[] str={1,2,3,4,5}；
二维数组的创建：
----使用new运算符：
------String[][] str=new String[5][3]；
------int[][] str=new int[5][3]；
----声明数组并且赋初始值
------String[][] str={{"张三","李四"},{"张三"，"李四"}}；
------int[][] str={{1,2,3},{1,2,3}}；
----------------------
数组名.length --------查询出数组的长度

----------------------引用类
public class yan{
	String name;//表示姓名变量
	int age;//表示年龄变量
	String sex;//表示性别变量
	public void say(){//方法
		System.out.println("name is"+name+" age is"+age+" sex is"+sex);
	}

}
-----
public class yan_yan{
	public static void main(String[] ags){
		yan k     = new yan();
	  //类 类型 变量名 = new 类型名();
		k.name="san";//为对象的name属性赋值
		k.sex="si";//为对象的sex属性赋值
		k.age=18;//为对象的age属性赋值
		k.say();//调用对象的方法
	}
}

-----------------------三目运算符
三目运算符：x>y ? x：y；
如果x>y为真则运行第一个结果（x），如果x>y为假则运行第二个结果（y）；
-----------------------方法（Method）
[修饰符] 返回值类型 方法名(参数类型 形参,参数类型 形参){
	执行语句；[return 返回值；]
}
public int sum(int x,int y){
	if(x>y){
		return x；
	}else{
		return y；
	}
}
调用对象类中的方法：
-new 类名（）.方法名（）；
-new a().fan()；
---类名 变量名 = new 类型名()；
---a b= new a()
---b.fan()；
---(仅静态)

方法的签名：
允许存在同名的方法，只要它们的参数个数或者参数类型或参数顺序不同。


成员变量 --- static int a=5 - 在 public static void main(String[] ags){} 外面 ；必须加静态（static）
局部变量 --- int a=5  ------- public static void main(String[] ags){ int a=5 }；
单行注释：//；------------ //后到本行结束的所有字符会被编译器忽略；
多行注释：/* */；--------- /*  */之间的所有字符会被编译器忽略；
文档注释：/** */；-------- 在/**  */之间的所有字符会被编译器忽略,java特有的(用于生成文档)；

&：与，会判断两个条件，不会出现短路效应；
&&：与，如果第一个条件为假，则不会判断第二个条件，会出现短路效应；
|：或，会判断两个条件，不会出现短路效应；
||：或，如果第一个条件为真，则不会判断第二个条件，会出现短路效应；
^：异或（相同为0，不同为1）；
~：取反；
<<：左移位；
>>：右移位；
>>>：无符号右移位；

-------------------------------------------------------------------------------
*是指的下面所有的子包括内容；
Scanner是指的Scanner一个类；

import java.util.*； 或者import java.util.Scanner；----- 必须存在(*是指的下面所有的子包括内容；Scanner是指的Scanner一个类；)
Scanner in(参数名) = new Scanner(System.in)；
double(类型)  a(参数名)=in(参数名).nextDouble()；
char a=in(参数名).next().charAt(0)；

--------------------------------------------------------------------------------
基本数据类型：大小/位
    byte：8  --- 小整数型
   short：16 --- 中整数型
     int：32 --- 整数型
    long：64 --- 长整数型
    char：16 --- 字符型
   float：32 --- 单精度
  double：64 --- 双精度
 boolean：1  --- 布尔类型 -- boolean 类型数据只允许取值true 或 false(不可以使用0 或非0的整数来代替true和false,区分于C语言)。
引用数据类型：
类；枚举；注解；接口；数组；
String：字符串型

---------------------------------------------------------------------------------
在一个源文件中有且只能有一个类文件是被public修饰的。
不提倡在一个源文件当中出现多个类（匿名类）
在一个源文件当中如果有多个类的定义，那么编译完成后会产生多个字节码文件（.class）

语句要写在方法体里

----------------------------------------------------------------------------------
abstract
Implement
do
private
this
boolean
double
Import
protected
throw
break
else
instanceof
public
throws
byte
extends
int
return
transient
case
false
interface
short
true
catch
final
long
static
try
char
fianlly
native
strictfp
void
class
float
new
super
volatile
continue
for
null
switch
while
default
ifpackage
enum
synchronized
assert

博客园
CSDN
51cto
阿狸
自媒体：
虎嗅
百度百家
站长之家
3358878403
