package finTech;

class clg{
	
	void clg() {
	System.out.println("Anna University");
}
}

public class dept extends clg {
	
	void dep() {
		System.out.println("E.C.E");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dept a=new dept();
		a.clg();
		a.dep();

	}

}
