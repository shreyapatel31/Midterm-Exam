package exam;

public class Data {

	private Node head;
	private Node tail;
	private int size;
	
	Data (){
		head = null;
		tail = head;
	}
	
	 private class Node {
		
		Node next;
		int data;
	}
	
	public void add(int a){
		Node first = head;
		head = new Node ();
		head.data = a;
		head.next = first;
		size++;
	}
	
	public int remove() {
		Node last = tail;
		tail.next = last;
		last.next = null;
		
		return last.data;
	}
	
	public void index() {
		
	}
	public void getValue(index i){
		Node pointer = head;
		
		if (pointer.data == i){
			System.out.println("The index is: " + i);
		}
	}
	
	public static void main (String [] args){
		Data x = new Data ();
		x.add(1);
		x.add(9);
		x.add(4);
		x.add(5);
		x.add(10);
		x.add(0);
		x.getValue(0);
		x.getValue(3);
	}
}
