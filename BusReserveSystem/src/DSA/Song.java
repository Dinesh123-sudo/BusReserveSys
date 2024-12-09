package DSA;
import java.util.ArrayList;
import java.util.Arrays;

import Human.mini.Node;

public class Song {
   
	Node head;
	int count=0;
	class Node{
		
		Node head;
		
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
		public void Song() {
			head=null;
		}
	}
	  public void insertbeg(int val) {
		  Node newnode=new Node(val);
		  if(head==null) {
			  head=newnode;
		  }
		  else {
			  newnode.next=head;
			  head=newnode;

		  }
		  
	  }
	  
	  public void insertend(int data) {
		  Node newnode=new Node(data);
		  Node temp=head;
		  while(temp.next!=null) {
			  temp=temp.next;
		  }
		  temp.next=newnode;


	  }
	  

	  
	  public void display() {
		  
		  Node temp=head;
		  while(temp!=null) {
			  count++;
			  System.out.print(temp.data+"->");
			  temp=temp.next;
	  }
		  System.out.println("End");
	
	}
	  public void  insertkey(int val){
		  
		  Node curr=head;
		  int data=4;
		  
		  while(curr!=null) {
			  if(curr.data==val) {
				  break;
			  }
			  curr=curr.next;
		  }
		  Node newnode=new Node(data);
		  newnode.next=curr.next;
		  curr.next=newnode;
	  }
	  
	  public void insertpos(int pos) {
		  
		  Node curr=head;
		  for(int i=1;i<pos-1&&curr!=null;i++) {
			  curr=curr.next;
		  }
		  Node newnode=new Node(4);
		  newnode.next=curr.next;
		  
		  curr.next=newnode;
	  }
	  
	  public void deletebeg() {
		  
		   head=head.next;
	  }
	public void delend() {
		
		Node curr=head;
		
		while(curr.next.next!=null) {
			curr=curr.next;
		}
		curr.next=null;
	   
	    
	}
	
	public void modular(int k) {
		
	   int k1=(int)Math.ceil((double)count/k);
	   Node curr=head;
	   int i=1;
	   while(curr!=null&&i<k1) {
		   curr=curr.next;
		   ++i;
	   }
	   System.out.print(curr.data);
	
	}
    public void ceil(int k) {
    	
    	Node temp=head;
    	int i=1;
    //	int n=i%k;
    	while(temp!=null) {
    		if(i%k==0) {
    			System.out.print(temp.data);
    		}
    		temp=temp.next;
    		i++;
    	}
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Song s=new Song();
         s.insertbeg(1);
         s.insertend(2);
         s.insertend(3);
          s.insertend(4);
          s.insertend(5);
          s.insertend(6);
          s.insertend(7);
          s.insertend(9);
          
          s.display();
          s.ceil(4);
         
     
          
         
        	
         
   }
}