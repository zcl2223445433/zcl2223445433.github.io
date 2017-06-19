public class Kucun {
	public String name;
	public float price;
	public int num;	

public  Jinhuo(String name,float price,int num){
	this.name=name;
	this.price=price;
	this.num=num;
}
public void say(){
	System.out.println("库存的货物是："+name+"，单价为："+price+"，数量是："+num);
}

}