package com.bridgelabz.DS;

public class Dequeue {
	public static final int Max = 100;
	int front = 1;
	int rear = 0;
	int[] a = new int[Max];

	boolean isFull() {
		return (front == 0 && rear == Max - 1 || front == rear);
	}

	boolean isEmpty() {
		return front == -1;
	}

	void insertAtfront(int data) {
		if (isFull()) {
			System.out.println("overflow");
			return;
		}

		if (front == -1) {
			front = 0;
			rear = 0;
		} else if (front == 0)
			front = Max - 1;
		else {
			front = front - 1;

		}
		a[front] = data;
	}

	void insertAtrear(int data) {
		if (isFull()) {
			System.out.println("overflow");
			return;
		}
		if (front == -1) {
			front = 0;
			rear = 0;
		} else if (rear == Max - 1)
			rear = 0;
		else {
			rear = rear + 1;

		}
		a[rear] = data;
	}

	void deletrfront() {
		if (isEmpty()) {
			System.out.println("queue under flow");
			return;
		}
		if (front == rear) {
			front = -1;
			rear = -1;
		} else if (front == Max - 1) {
			front = 0;
		} else {
			front = front + 1;
		}
	}

	void deleterear() {
		if (isEmpty()) {
			System.out.println("queue under flow");
			return;
		}
		if (front == rear) {
			front = -1;
			rear = -1;
		} else if (rear == 0) {
			rear = Max - 1;

		} else {
			rear = rear - 1;
		}
	}

	int getfront() {
		if (isEmpty()) {
			System.out.println("queue under flow");
			return -1;
		}
		return a[front];

	}

	int getrear() {
		if (isEmpty()) {
			System.out.println("queue under flow");
			return -1;
		}
		return a[front];

	}

	int size() {
		return (front - rear) + 1;
	}

	public static void main(String args[]) {
		Dequeue d = new Dequeue();
		System.out.println("insert element at the rear:5");
		d.insertAtrear(5);
		System.out.println("insert element at the front:10");
		d.insertAtfront(10);
		System.out.println("get rear element =" + d.getrear());
		d.deleterear();
		System.out.println("after deleting the  new elemen =" + d.getrear());

		System.out.println("insert element at the front:20");
		d.insertAtfront(20);
		System.out.println("get front element =" + d.getfront());
		d.deletrfront();
		System.out.println("after deleting the  new front element =" + d.getfront());

	}

	public String remove() {
		// TODO Auto-generated method stub
		return null;
	}
}
