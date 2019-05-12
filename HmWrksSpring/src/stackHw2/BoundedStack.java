package stackHw2;

import java.util.EmptyStackException;

public class BoundedStack<E> {
	
	public BoundedStack() {
		top = null;
	}
	
	private static class Node<E> {
		private E data;
		private Node<E> next;
	
		Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}
	}
	private Node<E> top;
	private Node<E> first;
	private int size = 1;
	
	public void push(E item) {
		if (item == null) {
			throw new NullPointerException();
		}
		if (size < 50) {
			top = new Node<E>(item, top);
			if(size == 1) {
				first = top;
			}
			size++;
		} else {
			overflow();
		}
	}
	
	public E pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		
		E data = top.data;
		size--;
		return data;
	}
	
	private void overflow() {
		first = first.next;
		size--;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	
}