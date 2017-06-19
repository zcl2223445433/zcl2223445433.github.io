public class School {
	String name;//学校名字
	String lx;//学校类型；
	String area;//地址
	String time;//办校时间
	public void say(){
		System.out.println(name+"办校时间长达"+time+"，位于:"+area+"，是一所"+lx);
	}
}
