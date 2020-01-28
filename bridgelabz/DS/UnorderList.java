package com.bridgelabz.datastructures;

import com.bridgelabz.datastructures.OrderList.Node;

//import com.bridgelabz.datastructures.LinkedList.Node;

public class UnorderList{
	
	class Node{
		 int  data;
		 Node next;
		 
		 Node(int  data){
			 this.data=data;
			 this.next=null;
		 }
		 
	 } 	 
	public Node head=null;
	public Node tail=null;
	public void addNode(int newdata) {
		Node newnode=new Node(newdata);
		
		//Node currentnode=head;
		if(head==null) {
			head=newnode;
			tail=newnode;
			
		}
		else {
			tail.next=newnode;
			tail=newnode;
			
		}
	}

	
	
			 public void display() {
				 Node  temp=head;
				 while(head==null) {
					 System.out.print("list is empty");
					 return;
				 }
					 while(temp!=null){
						 System.out.println(temp.data+" \t ");
						 temp=temp.next;
					 }
			System.out.println();
						 
						 
					 
					
					 
				 }
			 
			 public static void main(String args[]) {
				 UnorderList u=new UnorderList();
				 
				 
				 u.addNode(10);
				 u.addNode(20);
				 u.addNode(30);
				 u.addNode(40);
				 u.addNode(50);
				
				 System.out.println("initially the list as");
				 u.display();
				// u.delete(20);
				 
			 }

}
