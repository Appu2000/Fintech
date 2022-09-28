package finTech;

public class staticEg {
	int id;
	String name;
	String desig;
	
	//memory allocation and used for many objects as u like
	static String company="ibm";
	
	staticEg(int i,String n,String d)
	{
		id=i;
		name=n;
		desig=d;
	}
	
	void display(){
	  System.out.println(id+" "+name+" "+desig+" "+company);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticEg a=new staticEg(1,"sri","manager");
		staticEg b=new staticEg(2,"bose","teamleader");
		
		a.display();
		b.display();
		
		a.company="axis";
		//above change the college for all objects
		
		a.display();
		b.display();

	}

}
