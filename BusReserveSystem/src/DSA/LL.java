package DSA;

class Node{
	int data;
	Node next;
	
	Node(int data,Node next){
		this.data=data;
		this.next=next;
		System.out.println("linked list");
	}
	
	Node(int data){
		this.data=data;
		next=null;
		//System.out.println("linked list");
	}
	
}

public class LL {


		// TODO Auto-generated method stub
      int size;
      Node head;
  
      
      public boolean isempty() {
    	  return head==null;
      }
      
      public void add(int data) {
    	 // Node temp=head;
    	  Node newnode=new Node(data);
    	  if(head==null) {
    		  head=newnode;
    		  size++;
    	  }
    	  else {
    		  Node temp=head;
    		//  Node pre=null;
    		  while(temp.next!=null) {
    		     // pre=temp;
    		      temp=temp.next;
    		  }
    		  temp.next=newnode;
    		  size++;

    	  }
    	  	System.out.print(size);  
      }
    
	

}
