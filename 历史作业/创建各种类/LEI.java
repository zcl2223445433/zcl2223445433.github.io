public class LEI {
	public static void main(String[] args) {
		//学生
		student s=new student();
		s.eat();
		s.name="康华太";
		s.age=999;
		s.sex="一个可爱的男";
		s.say();
		//火车
		HuoChe h=new HuoChe();
		h.bc="第三班次";
		h.xh="飞天型";
		h.color="黑";
		h.time="凌晨";
		h.say();
		//手机
		Mob m=new Mob();
		m.name="小米6";
		m.color="银白色";
		m.clq="高通晓龙835";
		m.big="5.13寸";
		m.nc="256GB+6GB";
		m.say();
		//荣耀
		RongYao r=new RongYao();
		 r.name="李白";
	     r.lx="刺客";
	     r.pifu="凤求凰";
	     r.sld="满级";
		 r.say();
		 Teacher t=new Teacher();
		 t.name="张大帅";
	     t.age="37";
	     t.sex="男";
	     t.time="10";
		 t.say();
		 School sc=new School();
		 sc.name="山东交通技师学院";
	     sc.lx="技师学院";
	     sc.time="五年";
	     sc.area="临沂";
		 sc.say();
	}
}