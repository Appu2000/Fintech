package p1;
import java.util.*;

public class Task2 {
	
	void EorO(int a) {
		if(a%2==0) {
			System.out.println("the given nos "+a+"is Even");
		}
		else {
		  System.out.println("the given nos "+a+" is odd");
		}
	}
	
	void PoN(int a) {
		if(a<0) {
			System.out.println("the given nos "+a+"is negative");
			
		}
		if(a>=0) {
			System.out.println("the given nos "+a+"is positive");
		}
		
	}
	
	
	void Div(int nos,int n) {
		if(nos%n==0) {
			System.out.println("the given nos "+nos+"is divisible by "+n);
		}
		else {
			System.out.println("the given nos "+nos+"is not divisible by "+n);
		}
	}
	
	void swap(int n,int m) {
		int temp;
		System.out.println("BEFORE SWAPPING \nthe given nos m= "+m+"\n n="+n);
		 temp=m;
		 m=n;
		 n=temp;
		 
		System.out.println("AFTER SWAPPING \nthe given nos m= "+m+"\n n="+n);
	}
	
	void equal() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no. ");
		int n=sc.nextInt();		
		
		System.out.println("enter a no. ");
		int m=sc.nextInt();
		
		if(n==m) {
			System.out.println("they are equal");
		}
		else {
			System.out.println("they are not equal");
		}
	}
	
	void Big(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println(a+"is the biggest");
		}
		if(b>c && b>a) {
			System.out.println(b+"is the biggest");
		}
		else {
			System.out.println(c+"is the biggest");
		}
	}
	
	void leap(int y) {
		if(y%4==0) {
			System.out.println(y+" is a leapyear");
		}
		else if(y%400==0 && y%100==0) {
			System.out.println(y+"is aleapyear");
		}
		else {
			System.out.println(y+"is not a leapyear");
		}
	}
	
	void LastDigit(int y) {
		int d,x,sum=0;
		x=y;
		int o=1;
		if(y<=99) {
			System.out.println("the two digit is of"+y+"is"+y);

		}
		else {
		  while(y>99) {
			d=y%10;
			sum=sum+d*o;
			y=y/10;
			o=o*10;
			System.out.println(sum+" "+d+" "+y);
		 }
		}
		System.out.println("the two digit is of"+x+"is"+sum);
	}
	
	
	public static void main(String args[]) {
		
		Task2 t=new Task2();
		
		System.out.println("EVEN OR ODD");
		t.EorO(98);
		
		System.out.println("POS OR NEGATIVE");
		t.PoN(-10);
        
		System.out.println("DIVISIBLE OR NOT");
		t.Div(87, 4);
		
		System.out.println("SWAP");
		t.swap(5, 7);
		
		System.out.println("EQUALS OR NOT");
		t.equal();
		
		System.out.println("BIGGEST");
		t.Big(534, 123, 987);
		
		System.out.println("LEAP YEAR OR NOT");
		t.leap(2000);
		
		System.out.println("EVEN OR ODD");
		t.LastDigit(1975);
	}
		
}


