package main.java;


public class Node {

	public int data;
	
	private Node next;
	
	
	public Node () {
		this.data = -1;
		this.next = null;
	}
	
	public Node (int data) {
		this.data = data;
		this.next = null;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public int getData(){
		return(this.data);
	}

	public Node getNextNode() {

		if(next != null){
			return next;
		}
		else {
			return null;
		}
	}
	
	public void setNextNode(Node nextNode) {
		this.next = nextNode;
	}
	
	public Node getLastNode() {
		
		Node temp = this;

		while ( temp.getNextNode() != null) {
		
			temp = temp.next;
		}
		
		return temp;
	}
	
	
}

