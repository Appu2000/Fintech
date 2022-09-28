package finTech;
import java.util.*;

public class Queue {
	int max=5;
	int Q[]=new int[max];
	int front=0,rear=0;
	Scanner sc=new Scanner(System.in);
	
	void insert() {
		
		if(front==max-1) {
			System.out.println("Queue is full");
		}
		else {
		  System.out.println("enter the element: ");
		  int ele=sc.nextInt();
		  Q[front]=ele;
//		  System.out.print(front+" "+Q[front]);
		  front++;
		  
		}
	}
	
	void delete() {
		
		if (front==0) {
			System.out.println("no elements ");
		}
		else {
			front--;
		}
	}
	
	void display() {
		if(front==0) {
			System.out.println("no elements");
		}
		else {
			for(int i=front;i>=0;i--) {
				System.out.println(Q[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many elements: ");
		Scanner sc=new Scanner(System.in);
	
		Queue a=new Queue();
		int n=sc.nextInt();
		
		for(int j=0;j<n;j++) {
			a.insert();
		}
		System.out.println(" ");
		a.display();
		
		
		a.delete();
		System.out.println();
		a.display();
		
		a.delete();
		System.out.println();
		a.display();

	}

}
