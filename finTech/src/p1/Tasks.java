package p1;

import java.util.Scanner;

public class Tasks {
	char[] Swap(char[] str) {
		char temp;
		int j=str.length-1;
		for(int i=0;i<str.length/2;i++) {
			
				
				temp=str[j];
				str[j]=str[i];
				str[i]=temp;
				System.out.println(str);
			    j--;
			    
		}
		System.out.println(str);
		
		return str;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tasks a=new Tasks();
		
		Scanner s=new Scanner(System.in);
		char x[]= s.next().toCharArray();
		char y[]=new char[x.length];
		
		y=a.Swap(x);
        
		if(x==y) {
			System.out.println("the given is palindrome");
		}
		else {
			System.out.println("the given is not a palindrome");
		}
	}

}
