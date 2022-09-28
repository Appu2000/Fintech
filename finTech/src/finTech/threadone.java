//package finTech;
//
//public class threadone extends Thread {
//	public void run() {
//		for(int i=0;i<5;i++)
//		{
//		  System.out.print(i);
//		}
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		threadone t=new threadone();
//		t.start();
//	}
//
//}




//package finTech;
//import java.lang.Thread;
//class threadone extends Thread
//{
//    public void run()
//    {
//        try
//        {
//            for(int i=0;i<5;i++)
//            {
//            	Thread.sleep(1000);
//                System.out.println(i);
//            }
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
//    }
//    public static void main(String args[])
//    {
//        threadone t1=new threadone();
//        t1.start();
//    }
//}





//package finTech;
//
//import java.lang.Thread;
//
//class threadone extends Thread{
//	
//  public void run()
//  {
//      try
//      {
//          for(int i=0;i<5;i++)
//          {
//          	Thread.sleep(500);
//              System.out.println(i);
//          }
//      }
//      catch(Exception e)
//      {
//          System.out.println(e);
//      }
//  }
// public static void main(String args[]) {
//	 threadone t1=new threadone();
//	 threadone t2=new threadone();
//	 threadone t3=new threadone();
//	 t1.start();
//	 try {
//		 t1.join();
//	 }
//     catch(Exception e) {
//    	 System.out.println(e);
//     }
//	 t2.start();
//	 try {
//		 t2.join();
//	 }
//     catch(Exception e) {
//    	 System.out.println(e);
//     }
//	 t3.start();
//     }
//	
//}



//package finTech;
//
//import java.lang.*;
//
//class threadone extends Thread{
//	
//  public void run()
//  {
//      System.out.println("i am running");
//  }
// public static void main(String args[]) {
//	 threadone a=new threadone();
//	 threadone b=new threadone();
//	 threadone c=new threadone();
//	 
//	 System.out.println("priority is"+a.getPriority());
//	 System.out.println("priority is"+b.getPriority());
//	 System.out.println("priority is"+c.getPriority());
//	 
//	 a.setPriority(6);
//	 b.setPriority(3);
//	 c.setPriority(9);
//	 
//	 System.out.println("priority is"+a.getPriority());
//	 System.out.println("priority is"+b.getPriority());
//	 System.out.println("priority is"+c.getPriority());
//
//	 System.out.println(Thread.currentThread().getName());
//	 System.out.println(Thread.currentThread().getPriority());
//	 Thread.currentThread().setPriority(MAX_PRIORITY);
//	 System.out.println(Thread.currentThread().getPriority());
//	 
// }
//}


package finTech;

class on{
	synchronized void add(int n) {
//		for(int i=1;i<=5;i++) {
//			System.out.println(n*i);
//		}
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(n*i);
				Thread.sleep(2500);
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
	}
}

class Myt1 extends Thread{
	on t;
	Myt1(on t){
		this.t=t;
	}
	public void run(){
		t.add(2);
	}
}

class Myt2 extends Thread{
	on t;
	Myt2(on t){
		this.t=t;
	}
	public void run(){
		t.add(8);
	}
}

class threadone extends Thread{
   public static void main(String args[]) {
	   on obj=new on();
	   Myt1 t1=new Myt1(obj);
	   Myt2 t2=new Myt2(obj);
	   
	   
	   t1.start();
	   t2.start();
   }
}