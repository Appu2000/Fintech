package finTech;
// not completed
public class linky {
	class Node{
		 int data;
		 Node next;
		 
		 public Node(int data) {
			 
			 this.data=data;
			 this.next=null;
		 }
	  }
	public Node head =null;
	public Node tail=null;
	
	
//	public void addNode(int data) {
//		
//		Node newNode=new Node(data);
//		
//		if(head==null) {
//			
//			head=newNode;
//			tail=newNode;
//		}
//		else {
//			
//			tail.next=newNode;
//			tail=newNode;
//		}
//	}
//	
	public void addFirstNode(int data) {
			
			Node newNode=new Node(data);	
				head=newNode;
				tail=newNode;
			
	}
	
	public void addLastNode(int data) {
		
		Node newNode=new Node(data);	
	    Node temp=head;
	    while(temp.next!=null) {
	    	temp=temp.next;
	    }
	    temp.next=temp;    
   }
	
   public void InsertNode(int data,int pos) {
		
		Node newNode=new Node(data);	
	    Node temp=head;
	    for(int i=0;i<pos;i++) {
	       if(temp.next!=null) {
	    	  temp=temp.next;
	      }
	    }
	      temp=temp.next;     
   }
   
   public void pop() {
	   head=head.next;
   }
   
   public void RemoveLast() {
	   Node temp=head;
	   while(temp.next.next!=null) {
		   temp=temp.next;
	   }
	   temp.next=null;
   }
   
   public void remove(int pos) {
	   
	    Node temp1=head;
	    Node temp2=head;
	    for(int i=0;i<pos;i++) {
	       if(temp1.next!=null) {
	    	  temp1=temp1.next;
	      }
	    }
	      temp2.next=temp1.next.next;
	      temp1.next=temp2;
	      temp1.next=null;
	   
   }
	public void display() {
		 
		 
		 if(head==null) {
			 System.out.println("empty");
		 }
		 else {
			 Node temp =head;
	     	 System.out.print("Nodes in linked list:");
	     	 while(temp!=null) {
	     		 System.out.print(temp.data+" ");
	     		 temp=temp.next;
	     	 }
	     	 System.out.println();
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linky ll=new linky();
//		ll.addNode(10);
//		ll.addNode(20);
//		ll.addNode(30);
//		ll.addNode(40);
//		
		ll.display();
		
		ll.addFirstNode(5);
		ll.display();
		
     //	ll.addLastNode(30);
		ll.display();
//		
		
		
		

	}

}
