package com.bridgelabz.DS;

//import com.bridgelabz.datastructures.UnorderList.Node;

public class OrderList {
	public class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;

		}
	}

	public Node head = null;
	public Node tail = null;

	public void addNode(int newdata) {
		Node newnode = new Node(newdata);

		// Node currentnode=head;
		if (head == null) {
			head = newnode;
			tail = newnode;

		} else {
			tail.next = newnode;
			tail = newnode;

		}
	}

	public void delete(int x) {
		Node temp = head;
		Node prev = null;
		if (temp != null && temp.data == x) {
			head = temp.next;
			return;
		}
		while (temp != null && temp.data != x) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null) {
			return;

		}
		prev.next = temp.next;

	}

	public boolean search(int x) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == x)
				return true;// data found//
			temp = temp.next;
			System.out.println("data is available");
		}
		System.out.println("data is not available");
		return false;
	}

	public void display() {
		Node temp = head;
		while (head == null) {
			System.out.print("list is empty");
			return;
		}
		while (temp != null) {
			System.out.println(temp.data + " \t ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void sortList() {
		Node temp = head, index = null;
		int temp1;
		if (head == null) {

			return;

		} else {
			while (temp != null) {
				index = temp.next;
				while (index != null) {
					if (temp.data > index.data) {
						temp1 = temp.data;
						temp.data = index.data;
						index.data = temp1;
					}
					index = index.next;

				}
				temp = temp.next;
			}
		}

	}

	public static void main(String args[]) {
		OrderList u = new OrderList();
		u.addNode(65);
		u.addNode(20);
		u.addNode(43);
		u.addNode(15);
		u.addNode(50);

		System.out.println("initially the list as");
		u.display();

		System.out.println("after sorting the list");
		u.sortList();

		// u.delete(20);
		u.display();
	}

}
