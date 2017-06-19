class EnumDemo {
	public static void main(String[] args) {
		
	}
}
enum Color {
	RED("hong"),GREEN("lv"),BLUE("lan");
	
	private String name;
	private Color (String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public String toString(){
		return this.name;
	}
}
