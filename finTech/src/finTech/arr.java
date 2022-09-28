package finTech;
import java.util.*;

public class arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
//		ArrayList<Integer>a=new ArrayList<Integer>();
//		for(int i=0;i<=10;i++) {
//			a.add(i);
//		}
//		Iterator it=a.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
//		for(Integer num:a) {
//			System.out.print(num);
//		}

		try {
		ArrayList<Integer>a=new ArrayList<Integer>();
		ArrayList<Integer>b=new ArrayList<Integer>() ;
//		ArrayList<Integer>b=null;
		for(int i=0;i<=10;i++) {
			a.add(i);
			b.add(i*10);
 		}
		a.removeAll(b);
		System.out.println(a+"\n"+b);
	  }	
	
	catch(NullPointerException e) {
		System.out.print(e);
	}
  }
}
