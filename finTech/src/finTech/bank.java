package finTech;

abstract class banks{
//	abstract void roi();
	int interest() {
		return 0;
	}
}
class sbi extends banks{
	int interest() {
		return 5;
	}
}
class axis extends banks{
	int interest() {
		return 7;
	}
}
class kvb extends banks{
	int interest() {
		return 10;
	}
}
class a extends banks{
	void roi() {
		System.out.print("this is abstract class");
	}
	
}
public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		sbi a=new sbi();
		System.out.println(a.interest());
		
		axis c=new axis();
		System.out.println(c.interest());
		kvb d=new kvb();
		System.out.println(d.interest());
		a e=new a();
		System.out.println(e.interest());
		e.roi();

	}

}
