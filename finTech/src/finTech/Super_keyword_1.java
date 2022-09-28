package finTech;

class vechile{
	int id;
	String color;
	String model;
	//default constructor
	vechile(){
		System.out.println("default constructor");
	}
	
	//paramertized constructor
	vechile(int id,String color,String model){
		this.id=id;
		this.color=color;
		this.model=model;
		
	}
	void display1() {
		System.out.println(id+" "+model+" "+color);
			
	}
	
}

public class Super_keyword_1 extends vechile {
	
	
	void display(){
		super.display1();
	
	}
	public static void main(String[] args) {
	    vechile a=new vechile(1,"black","bmw");
		Super_keyword_1 s= new Super_keyword_1();
		s.display();
		a.display1();
	}

}
