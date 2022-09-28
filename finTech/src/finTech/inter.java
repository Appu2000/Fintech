package finTech;
interface Y{
	void display();
	void getdata();
}

interface Z{
	void add();
}


class inter implements  Y,Z{
	
	public void getdata() {
		System.out.println("getdata");
	}
	public void display() {
		System.out.println("its display");
	}
	public void add()
	{
		System.out.println("its addition");
	}
	
   public static void main(String args[]) {
	   
	   inter obj=new inter();
	   obj.add();
	   obj.display();
	   obj.getdata();
   }

}
