package com.bridgelabz.datastructures;

public class LinkedList<T> {
	Node<T>head;
	
 static class Node<T>{
	 T data;
	 Node next;
	 
	 Node(T data){
		 this.data=data;
		 this.next=null;
	 }
	 
 } 	 
	 
		 public void display() {
			 Node<T> temp=head;
			 while(temp!=null) {
				 System.out.print(temp.data+" ");
				 temp=temp.next;
				 
			 }
		 }
		 
		 // insert a new node at begin//
		public void insertAtFirst(T newdata) {
			Node<T> newnode=new Node(newdata);
			
			Node<T> currentnode=head;
			if(currentnode==null) {
				System.out.println("list is empty ");
				head=newnode;
			}
			else {
				newnode.next=head;
				head=newnode;
			}
		}
			public void insertAStmiddile(Node prevnode,T newdata) {
				// now i am check  prev node is null r not//
				if(prevnode==null) {
					System.out.println("prev node is cannot be null");
					return ;
					
				
			}
				Node<T> newnode=new Node(newdata);
				newnode.next=prevnode.next;
				prevnode.next=newnode;;
		}
			//insert at end//
			  public void insertAtend(T newdata) 
			    { 
			       
			        Node<T> new_node = new Node(newdata); 
			  
			      
			        if (head == null) 
			        { 
			            head = new Node(newdata); 
			            return; 
			        } 
			  
			      
			        new_node.next = null; 
			  
			      
			        Node last = head;  
			        while (last.next != null) 
			            last = last.next; 
			      last.next = new_node; 
			        return; 
			    } 
			  // delete node at position//
			  
			  void deleteNode(  T key) 
			    { 
			     
			       Node<T> temp = head, prev = null; 
			  
			     
			        if (temp != null && temp.data == key) 
			        { 
			            head = temp.next; 
			            return; 
			        } 
			  
			      
			        while (temp != null && temp.data != key) 
			        { 
			            prev = temp; 
			            temp = temp.next; 
			        }     
			  
			     
			        if (temp == null) return; 
			  
			        prev.next = temp.next; 
			    } 
			  
			    
			  
				// find size of list//
			  public int Listsize() {
				  Node current=head;
				  int counter=0;
				  while(current !=null) {
					  current=current.next;
					  counter++;
				  }
				 System.out.println("\n linked list size "+counter);
				return counter;
				  
			  }
			// find middle element in linkedlist//
			  public int findMiddleElement() {
				  Node fast=head;
				  Node slow=head;
				  int counter=0;
				  while(fast !=null &&fast.next !=null) {
					  slow=slow.next;
					  fast=fast.next.next;
					  counter ++;
					  
				  }
				  System.out.println("middle element position in the list as \t "+slow.data);
				  return counter;
			  }

		

		 public static void main(String args[]) {
			 LinkedList u=new LinkedList();
			 
			 //now create 4 nodes//
	          u.head=new Node("hai");
	          Node second=new Node("bridgebalz");
	          Node third=new Node("howru");
	          Node fourth=new Node("kk");
	         u.head.next=second;
	          second.next=third;
	          third.next=fourth;
	          System.out.println("create a  nodes are");
	           u.display();
	           System.out.println("\n insert at first new string data");
	           u.insertAtFirst("akiliesh");
	           u.insertAtFirst("siva");
	           u.display();
               System.out.println("\n after insert a new nodes the list as");
               u.insertAStmiddile(u.head.next, "aditya");
               u.insertAStmiddile(u.head.next.next, "suresh");
               u.display();
               System.out.println("\n  insert a new string data at end the list as");
               u.insertAtend("yogi");
               u.insertAtend("rishi");
               u.display();
               System.out.println("\n  cerate a new int   node data in list");
               u.head=new Node(1);
 	          Node second2=new Node(2);
 	          Node third3=new Node(3);
 	          Node fourth4=new Node(4);
 	          u.head.next=second2;
 	          second2.next=third3;
 	          third3.next=fourth4;
              u.display();
              System.out.println("\n insert at first new int  data");
	           u.insertAtFirst(5);
	           u.insertAtFirst(6);
	           u.display();
	           System.out.println("\n after insert a new int nodes the list as");
               u.insertAStmiddile(u.head.next, 7);
               u.insertAStmiddile(u.head.next.next, 8);
               u.display();
               System.out.println("\n  insert a new  int data at end the list as");
               u.insertAtend(10);
               u.insertAtend(11);
               u.display();
	           
              
         
        

}

		
}

	
	


	