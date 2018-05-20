package com.ds.linkedlist;

public class SingleLinkedList {
	
	private Node head;
	
	public SingleLinkedList() {
		head =new Node();
	}
	
	public void add(int data) {
		if(head.getNext()==null) {
			Node ndata=new Node(data);
			System.out.println("First Data Added : "+ndata.getData());
			head.setNext(ndata);
		}else {
			Node n=head;
			while(n.getNext()!=null) {
				n=n.getNext();
			}
			Node ndata=new Node(data);
			System.out.println("Data Added : "+ndata.getData());
			n.setNext(ndata);
		}
	}
	
	public int getSize() {
		Node n=head;
		int count=0;
		while(n.getNext()!=null) {
			count++;
			n=n.getNext();
		}
		return count;
	}
	
	public String printDataCommaSeperated() {
		Node n=head.getNext();
		StringBuilder sb=new StringBuilder();
		while(n.getNext()!=null) {
			sb.append(n.getData());
			sb.append(" , ");
			n=n.getNext();
		}
		sb.append(n.getData());
		return sb.toString();
	}
	
	public void addFirst(int data) {
		Node ndata=new Node(data);
		ndata.setNext(head.getNext());
		head.setNext(ndata);
	}
	
	public void addLast(int data) {
		Node ndata=new Node(data);
		Node n=head.getNext();
		StringBuilder sb=new StringBuilder();
		while(n.getNext()!=null) {
			sb.append(n.getData());
			sb.append(" , ");
			n=n.getNext();
		}
		n.setNext(ndata);
	}
	
	public void getAtIndex(int index) {
		
	}
	
	public void removeFirst() {
		Node first=head.getNext();
		head.setNext(first.getNext());
	}
	
	public void removeLast() {
		Node n=head.getNext();
		while(n.getNext().getNext()!=null) {
			n=n.getNext();
		}
		n.setNext(null);
	}
	
	public void removeAtIndex(int index) {
		
	}
	
}
