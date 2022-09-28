package finTech;
//multilevel inheriance

class grandpa{
	void oldest() {
		System.out.println("i am the oldest");
	}
}

class parent extends grandpa{
	void old() {
		System.out.println("i am old");
	}
}

public class child extends parent{
	 void young() {
		 System.out.println("i am the youngest");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child a=new child();
		parent b=new parent();
		
		a.young();
		a.old();
		a.oldest();
		
		

	}

}
