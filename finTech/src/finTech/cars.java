package finTech;

class cars {
	int id;
	String model;
	double price;
	String colour;
	
	//default constructor
	cars(){
		System.out.println("hello");
	}
	
	//parameterized constructor
	cars(int n,String m,int r,String c) {
		this(); 
		//above calls the default constructor
		id= n;
		model=m;
		price=r;
		colour=c;
		
	}
	
	protected void display() {
		System.out.println(id+"."+model+" of rupees "+price+" is avail in "+colour);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cars a=new cars(1, "bmw", 1000000,"White");
		cars b=new cars(2, "audi", 800000,"Black");
		cars c=new cars(3, "kia", 500000,"blue");
		
		a.display();
		b.display();
		c.display();
		
		
		
		
		

	}

}
