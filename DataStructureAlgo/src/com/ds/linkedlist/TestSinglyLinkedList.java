package com.ds.linkedlist;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
	
		SingleLinkedList s1=new SingleLinkedList();
		s1.add(1);
		s1.add(5);
		s1.add(9);

		System.out.println("Size : "+s1.getSize());
		System.out.println(s1.printDataCommaSeperated());
		s1.addFirst(88);
		s1.addLast(99);
		System.out.println(s1.printDataCommaSeperated());
		s1.removeFirst();
		System.out.println(s1.printDataCommaSeperated());
		s1.removeLast();
		System.out.println(s1.printDataCommaSeperated());

	}

}
