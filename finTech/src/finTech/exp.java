package finTech;

public class exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,6,8};
		String str="null";
		String s=null;
		
		try {
//			
//	     	a[89]=67;
//	     	a[0]=13/0;
//			System.out.println(a[10]);	
//			System.out.println(s.length());
//			int i=Integer.parseInt(str);
//			for(int j=0;j<5;j++) {
//				System.out.print(a[j]);
//			}
			System.out.println(s.charAt(-1));
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
//		catch(IndexOutOfBoundsException e) {
//   		System.out.println(e);
//		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);	
		}
		
		finally {
			System.out.print("in finally block");
		}
		
		
		System.out.println("rest cody");

	}

}
