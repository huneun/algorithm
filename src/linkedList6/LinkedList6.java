package linkedList6;

public class LinkedList6<T> {
	
	Node<T> head = null;
	
	public class Node<T> {
		
		Node<T> next;
		T data;
		
		public Node(T data) {
			this.data = data;
		}
		
	}
	
	public void addNode(T data) {
		if(this.head == null) {
			this.head = new Node(data);
		}else {
			Node<T> node = head;
			while(this.head.next != null ) {
				node = this.head.next;
			}
			this.head.next = new Node(data);
		}
	}
	
	public void printAll() {
		if(this.head != null) {
			System.out.println(head.data);
			Node<T> node = this.head;
			while(this.head.next != null) {
				node = this.head.next;
				System.out.println(node.data);
			}
		}
	}
	
	public Node searchNode(T data) {
		if(this.head == null) {
			return null;
		}else {
			Node<T> node = this.head;
			while(this.head.next != null) {
				if(node.data == data) {
					return node;
				}else {
					node = this.head.next;
				}
			}
		}
		return null;
	}
	
	
	
}
