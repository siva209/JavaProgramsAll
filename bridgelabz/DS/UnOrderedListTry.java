package com.bridgelabz.datastructures;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//import com.bridgelabz.datastructures.UnOrderTestUsingFiles.Node;

public class UnOrderedListTry {
	
	
	static class Node{
		String data;
		Node next;
		
		
	}
	static Node head;
	
	public static void main(String[] args) {
		
		String fileData=new String();
		try {
			int i;
			FileReader fileReader=new FileReader("/home/user/Desktop/unordered.txt");
			 while ((i=fileReader.read()) != -1) 
			     	fileData=fileData+ (char) i;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String [] wordsFile=fileData.split(" ");
		for (int i = 0; i < wordsFile.length; i++) {
			insert(wordsFile[i]);
			
		}
		display();
	    search("now");
		delete("now");
	}
		public  static void insert(String data)
		{
			Node node =new Node();
			node.data=data;
			node.next=null;
			if(head==null)
			{
				head=node;
				
			}
			else
			{
				Node n=head;
				while(n.next!=null)
				{
					n=n.next;
				}
				n.next=node;
			}
		}
		
		
		public static void display()
		{
			Node n=head;
			if(head==null)
			{
				System.out.println("empty");
			}
			else
			{
				while(n.next!=null)
				{
					System.out.println(n.data);
					n=n.next;
				}
				System.out.println(n.data);
			}
		}
		public static void delete(String key) {
			 Node temp = head, prev = null; 
			  
		     
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
		  public static  boolean search(String x) {
			  Node temp=head;
			  while(temp !=null) {
				  if(temp.data==x) {
					  return true;
				  }
					  temp=temp.next;
					  
					  System.out.println("data is found");
					  
				  }
				  
					  System.out.println("no data found");
					  return false;
				  
		  }
		  
			 	  
			
		  }
		    
		  
		
		
		
	
	
	
	
	
	
	
	


