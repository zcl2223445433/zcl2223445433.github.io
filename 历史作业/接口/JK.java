public class JK {
	public static void main(String[] args) {
		USB s = new Computer();
		s.useUSB();
		USB u = new Flash();
		u.useUSB();
	}
}
interface USB{
	void useUSB();
}
class Computer implements USB{
	public  void useUSB(){
		System.out.println("111111");
	}
}
class Flash implements USB{
	public void useUSB(){
		System.out.println("22222");		
	}
}
//class Print implements USB{}
