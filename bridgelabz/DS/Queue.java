package com.bridgelabz.DS;

class Node<T> {
	T data;
	Node next;

	public Node(T data) {
		this.data = data;
		this.next = null;
	}
}

public class Queue<T> {
	Node front, rear;

	public Queue() {
		this.front = null;
		this.rear = null;
	}

	public void enqueue(T data) {
		Node<T> temp = new Node<>(data);
		if (this.rear == null) {
			this.front = temp;
			this.rear = temp;
			return;
		}
		this.rear.next = temp;
		this.rear = temp;
	}

	Node<T> dequeue() {
		if (this.front == null) {
			return null;

		}
		Node<T> temp = this.front;
		this.front = this.front.next;
		if (this.front == null) {
			this.rear = null;
		}
		return temp;

	}

	public void display() {
		Node<T> temp = front;
		while (temp != null) {
			System.out.print(temp.data + " \t");
			temp = temp.next;

		}
	}

	public static void main(String args[]) {
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println("elements in the queue:");
		q.display();
		System.out.println("\n elements after dequeue=" + q.dequeue());
		q.display();
		System.out.println("\n string  data in the queue");
		q.enqueue("siva");
		q.enqueue("hai");
		q.enqueue("how");
		q.display();
		System.out.println("\n  string elements after dequeue=" + q.dequeue());
		q.display();
	}
}
