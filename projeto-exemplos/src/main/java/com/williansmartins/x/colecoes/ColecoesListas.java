package com.williansmartins.x.colecoes;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ColecoesListas {

	public static void main(String[] args) {
		acaoArrayList();
		acaoVector();
		acaoLinkedList();
	}

	private static void acaoLinkedList() {
		// create a linked list
		LinkedList ll = new LinkedList();
		// add elements to the linked list
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		ll.addLast("Z");
		ll.addFirst("A");
		ll.add(1, "A2");
		System.out.println("Original contents of ll: " + ll);

		// remove elements from the linked list
		ll.remove("F");
		ll.remove(2);
		System.out.println("Contents of ll after deletion: " + ll);

		// remove first and last elements
		ll.removeFirst();
		ll.removeLast();
		System.out.println("ll after deleting first and last: " + ll);

		// get and set a value
		Object val = ll.get(2);
		ll.set(2, (String) val + " Changed");
		System.out.println("ll after change: " + ll);
	}

	private static void acaoVector() {
		// Vector implements a dynamic array. It is similar to ArrayList, but with two
		// differences
		// Vector is synchronized.
		// Vector contains many legacy methods that are not part of the collections
		// framework.
		// http://www.tutorialspoint.com/java/java_vector_class.htm

		// initial size is 3, increment is 2
		Vector v = new Vector(3, 2);
		System.out.println("Initial size: " + v.size());
		System.out.println("Initial capacity: " + v.capacity());
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		System.out.println("Capacity after four additions: " + v.capacity());

		v.addElement(new Double(5.45));
		System.out.println("Current capacity: " + v.capacity());
		v.addElement(new Double(6.08));
		v.addElement(new Integer(7));
		System.out.println("Current capacity: " + v.capacity());
		v.addElement(new Float(9.4));
		v.addElement(new Integer(10));
		System.out.println("Current capacity: " + v.capacity());
		v.addElement(new Integer(11));
		v.addElement(new Integer(12));

		// get values
		System.out.println("First element: " + (Integer) v.firstElement());
		System.out.println("Last element: " + (Integer) v.lastElement());
		if (v.contains(new Integer(3)))
			System.out.println("Vector contains 3.");

		// enumerate the elements in the vector.
		Enumeration vEnum = v.elements();
		System.out.println("\nElements in vector:");

		while (vEnum.hasMoreElements())
			System.out.print(vEnum.nextElement() + " ");
		System.out.println();
	}

	private static void acaoArrayList() {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(2);
		lista.add(4);
		lista.add(2);
		lista.add(2);
		lista.add(2);
		lista.add(2);

		lista.set(0, 3);

		System.out.println(lista);
		System.out.println(lista.get(0));

		for (Integer item : lista) {
			System.out.println(item);
		}

	}
}