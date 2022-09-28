package finTech;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Two{
	int x,y;
	Two(){
		x=10;
		y=8;
	}
}

public class HW {
//	public static void main(String args[]) {
//		
//		Two a=new Two();
//		System.out.println(a.x+" "+a.y);
//		
//		Two b=new Two();
//		Two b=a;
//		
//		b.x=2;
//		b.y=6;
//		System.out.println(b.x+" "+b.y);
//		System.out.println(a.x+" "+a.y);
//	}
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try {
//		
//		ArrayList<String>a=new ArrayList<String>(1);
//		
//		a.add("icecream");
//		a.add("apple");
//		a.add("banana");
//		a.add("citrus");
//		a.add("dragon fruit");
//		
//		ListIterator<String> it=a.listIterator();
//		 while(it.hasNext()) {
//			System.out.println(it.next());
//		a.clear();	
//		}
//	}
//	
//	catch(IndexOutOfBoundsException e) {
//		System.out.println(e);
//	}
//		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String>a=new ArrayList<String>(1);
		
		a.add("icecream");
		a.add("apple");
		a.add("banana");
		a.add("citrus");
		a.add("dragon fruit");
		
		for(String str:a) {
			System.out.println(str);
		}
		Object object=a.toArray();
		
		a.add("elachi");
		for(String str:a) {
			System.out.println(str);
		}
		 //System.out.println(object.length());
		
	
	
}
}
