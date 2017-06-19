public class Huo {
	public String name;
	public float jinjia;
	public float maijia;
	public int jinhuo;	
	public int maihuo;	
	public int kucun;		
public  Huo(String name,float jinjia,float maijia,int jinhuo,int maihuo,int kucun){
	this.name=name;
	this.jinjia=jinjia;
	this.maijia=maijia;
	this.jinhuo=jinhuo;
	this.maihuo=maihuo;
	this.kucun=kucun;
}
public void say(){
	System.out.println("商品的名字是："+name+"进货数量："+jinhuo+"，进货单价是："+jinjia+"，售出数量："+maihuo+
						"，售出单价："+maijia+"，剩余库存："+kucun);
}

}