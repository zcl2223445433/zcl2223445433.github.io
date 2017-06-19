public class Huo {
	public String name;
	public float jprice;
	public float mprice;
	public int jnum;	
	public int mnum;	
	public int kucun;		
public  Jinhuo(String name,float price,int num){
	this.name=name;
	this.price=price;
	this.num=num;
}
public void say(){
	System.out.println("售出的货物是："+name+"，单价为："+price+"，数量是："+num);
}

}