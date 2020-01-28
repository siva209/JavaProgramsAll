package com.bridgelabz.BasicProgram;

import com.bridgelabz.datastructures.UnOrderList;
import com.bridgelabz.datastructures.UnOrderList.Node;


public class Example {
	Node head;
	 static class Node{
		int data;
		 Node next;
		Node(int data){
			//this.data=data;
			this.data=data;
			this.next=null;
			
			
		}
		
	}
	 public void printList() {
		 
		 Node temp=head;
		 while(temp!=null) {
			 System.out.print("\t"+temp.data+"");
			 temp=temp.next;
			 
		 }
		 
	 }
	 //insert a new node at start//
	 public void inseretAtBegin(int newdata) {
		 Node newnode=new Node(newdata);
		 newnode.next=head;
		 head=newnode;
	 }
	 //insert a node at middle//
	 public void insertAfter(Node prev_node, int new_data) 
	 { 
	    
	     if (prev_node ==null) 
	     { 
	         System.out.println("The given previous node cannot be null"); 
	         return; 
	     }
	     Node new_node = new Node(new_data);
	     new_node.next = prev_node.next;
	     prev_node.next = new_node; 
	 } 
	 public void insertAtend(int new_data) 
	 {
	     Node new_node = new Node(new_data);
	     if (head == null) 
	     { 
	         head = new Node(new_data); 
	         return; 
	     }
	     new_node.next = null; 
	   
	    
	     Node last = head;  
	     while (last.next != null) 
	         last = last.next; 
	   
	   
	     last.next = new_node; 
	     return; 
	 } 
		 	 
	 
	 
	 
	 
	 
	 public static void main(String args[]) {
		 UnOrderList u=new  UnOrderList();
		 u.head=new Node(1);
		 Node second =new Node(2);
		 Node third=new Node(3);
		 Node fourth=new Node(4);
		 u.head.next=second;
		 second.next=third;
		 third.next=fourth;
		System.out.println("nodes are");
		
		 //now push a node//
	
		 u.inseretAtBegin(5);
		 u.inseretAtBegin(6);
		 u.inseretAtBegin(7);
		
		 //insert at middle//
		 u.insertAfter(u.head.next, 10);
		
		 //insert at end//
		
		 u.insertAtend(10);
		 u.printList();
		 
		 
		 
		 

	 }

}
public void insertAtend(String new_data) 
{
    Node new_node = new Node(new_data, head);
    if (head == null) 
    { 
        head = new Node(new_data); 
        return; 
    }
    new_node.next = null; 
  
   
    Node last = head;  
    while (last.next != null) 
        last = last.next; 
  
  
    last.next = new_node; 
    return; 
} 
	 

}
System.out.println("\n after insert a new nodes the list as");
System.out.println("after insert a new nodes  at midddle the list as");
u.insertAtFirst(5);
u.insertAtFirst(6);
u.insertAtFirst(7);
// u.insertAStmiddile(u.head.next.next, 10);
//u.display();
 
//System.out.println("after insert a new nodes the list as");

}
public class FileWordSearch { public static void main(String[] args) throws IOException {
	File f1=new File("input.txt"); //Creation of File Descriptor for input file 
	String[] words=null; //Intialize the word 
	Array FileReader fr = new FileReader(f1); 
	//Creation of File Reader object 
	BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object 
	String s; String input="Java"; // Input word to be searched
	int count=0; //Intialize the word to zero
while((s=br.readLine())!=null) //Reading Content from the 
	file { words=s.split(" "); //Split the word using space for
	(String word : words) {
		if (word.equals(input)) //Search for the given word { 
			count++; //If Present increase the count by one
	}
	}
}

public void delete(int x) {
	Node temp=head;
	Node prev=null;
	if(temp !=null &&temp.data==x) {
		head=temp.next;
		return;
	}
	while(temp !=null &&temp.data!=x) {
		prev=temp;
		temp=temp.next;
	}
	if(temp==null) {
		return;
		
	}
	prev.next=temp.next;
	
}
public boolean search(int x) {
	Node temp=head;
	while(temp!=null) {
		if(temp.data==x) 
			return true;// data found//
			temp=temp.next;
			System.out.println("data is available");
		}
	System.out.println("data is not available");
	return false;
	}
	 
