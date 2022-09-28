package p1;
import java.util.*;
class users{
	String name="";
	int pin;
	int bal;
}

public class ATM {
	Scanner sc=new Scanner(System.in);
	int tu=0;
	int Display(users a[]) {
		System.out.println("\t\tWELCOME  TO OUR ATM");
		System.out.println("\n\t 1.NEW USER\t\t 2.OLD USER");
		int ch=sc.nextInt();
		if(ch==1) {
			tu=new_Users(a)+2;
		}
		return tu;
	}
	
	
	void Display1(String str) {
		int i=0;
		System.out.println("\t\tWELCOME  "+str.toUpperCase());
		System.out.println("1.Change User\t\t2.Check balance\n3.Withdrawal\t\t4.Deposit\n5.Exit");
		System.out.println("________________________________________");
		if(i>0) {
		    System.out.println("choice...");
		}
		i++;
	}
	
	
	int new_Users(users a[]) {
		int n=0;
	
		{
			System.out.print("enter no. of users :");
			n=sc.nextInt();
			for(int i=2;i<n+2;i++) {
				a[i]=new users();
				
				System.out.print("\nenter new user name :");
				a[i].name=sc.next();
				
				System.out.print("\nenter New Password :");
				a[i].pin=sc.nextInt();
				
				System.out.print("\nenter user bal :");
				a[i].bal=sc.nextInt();
				System.out.println("_________________________________");
				

			}
			System.out.println("choice...");
			
		}
		return n;
	}
	
	int CheckCred(users a[],int n){
		
		int flag=0;
		int id=0;
		
		
		System.out.print("\nenter user name :");
		String str=sc.next();
		for(int i=0;i<=n+2;i++) {
		
			if(a[i].name.equals(str)) {
				System.out.print("\nenter your pin :");
				int p=sc.nextInt();
				flag++;
				if(p==a[i].pin) {
					id=i;
				    return id;
					
				}
				else {
					System.out.println("pin is incorrect");
					break;
				}
			}
			
			}
		if(flag==0) {
			System.out.println("User not found");
		}	
		
	    
		 return 100;
	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=0;
		int n=0;
		ATM D=new ATM();
		int i=0;
        
		Scanner sc=new Scanner(System.in);
		
		users a[]=new users[5];
		users b=new users();
		
		a[0]=new users();
		a[0].name="sri";
		a[0].pin=1234;
		a[0].bal=1000;
		
		a[1]=new users();
		a[1].name="bose";
		a[1].pin=1234;
		a[1].bal=0;
		
		n=D.Display(a);
		i=D.CheckCred(a, n);
		D.Display1(a[i].name);
		
		do {
		ch=sc.nextInt();
		switch(ch){
			case 1:{	
				if(i>100) {
					D.new_Users(a);
					D.Display1(b.name);
					break;
				}
				else {
					i=D.CheckCred(a, n);
					D.Display1(a[i].name);
				}
			
				break;
				
			}
			case 2:{
				
				if(i>100) {
					D.Display1(b.name);
					break;
				}
				else {
		
					System.out.println("Your balance is "+a[i].bal+"\n");
					D.Display1(a[i].name);
					System.out.println("________________________________________");
					break;
				}
			}
			
			case 3:{
				
				if(i>100) {
					D.Display1(b.name);
					break;
				}
				else {
					int amt;
					System.out.print("\nENTER THE AMOUT TO DEBIT: ");
					amt=sc.nextInt();
					a[i].bal=a[i].bal-amt;
					System.out.print("\n"+amt+" AMOUT IS DEBITED");
					D.Display1(a[i].name);
					System.out.println("________________________________________");
				    break;
				}
				
			}
			case 4:{

				if(i>100) {
					D.Display1(b.name);
					break;
				}
				else {
					int amt;
					System.out.println("ENTER THE AMOUT TO DEPOSIT: ");
					amt=sc.nextInt();
					a[i].bal=a[i].bal+amt;
					System.out.println(amt+" AMOUT IS DEPOSITED");
					D.Display1(a[i].name);
					System.out.println("________________________________________");
				    break;
				}
				
			}
			case 5:{
				System.out.println("THANKS OF USING OUR ATM\nHAVE A NICE DAY");
				break;
			}
			default:{
				System.out.println("invalid command");
				break;
			}
		}
		}while(ch!=5);

	}

}
