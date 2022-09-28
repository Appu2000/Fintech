package finTech;

abstract class one{
	abstract void display();
}

public class abst extends one{
	
	void display()
	{
		System.out.print("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		abst obj=new abst();
		obj.display();

	}

}
