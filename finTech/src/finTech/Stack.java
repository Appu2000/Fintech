package finTech;
import java.util.*;

public class Stack {
	static int max=5;
	
		int stack[]=new int[max];
		int top=-1;
		Scanner sc=new Scanner(System.in);
	
	
	 void push() {
		
		if(top==max-1) {
			
			System.out.println("Stack is full");
		}
		else {
			System.out.println("enter the element: ");
			int ele=sc.nextInt();
			top++;
			stack[top]=ele;
			
		}
	}
	 
	void pop() {
		if(top==-1) {
			System.out.println("Stack is under flow");
		}
		else {
		top--;
		}
	}
	
	
	void display() {
		if(top==-1) {
			System.out.println("Stack is under flow");
		}
		else {
			int s=top;
			for(int i=0;i<=s;s--) {
				System.out.println(stack[s]);
			}
		}
		
	}
	
public static void main(String args[]) {
	
	     Stack a=new Stack();
	     Scanner x=new Scanner(System.in);
	     int nos=x.nextInt();
	     for(int i=0;i<nos;i++) {
	        a.push();
	     }
	     System.out.println();
		 a.display();
		 
		 
		 a.pop();
		 System.out.println();
		 a.display();
		 
	}

}
