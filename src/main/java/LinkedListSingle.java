package main.java;

/**
 * @author: Raghu Murugesan
 */
import java.io.Console;

public class LinkedListSingle {

	private Node head;
	private int listLength;

	LinkedListSingle() {
		head = new Node();
		listLength = 0;
	}

	public int addData(int data) {
		Node newNode = new Node(data);
		Node temp = head.getLastNode();
		temp.setNextNode(newNode);
		this.listLength++;
		return (1);
	}

	public void deleteNodeByData(int data) {
		if (this.listLength <= 0) {
			System.out.println("List is Empty");
			return;
		}

		Node previousNode = head;
		Node thisNode = previousNode.getNextNode();
		Node nextNode = thisNode.getNextNode();
		int deleteCount = 0;

		while (thisNode != null) {

			if (thisNode.getData() == data) {
				previousNode.setNextNode(nextNode);
				this.listLength -= 1;
				deleteCount += 1;
			} else {
				previousNode = thisNode;
			}

			thisNode = thisNode.getNextNode();
			if (thisNode != null) {
				nextNode = thisNode.getNextNode();
			}
		}
		if (deleteCount != 0) {
			System.out.println("Deletion Completed. Total Nodes deleted = "
					+ deleteCount);
		} else {
			System.out.println("No Match found");
		}
	}

	public void printList() {
		Node temp = head.getNextNode();
		if (temp == null) {
			System.out.println("List Empty");
			return;
		}
		System.out.println("");
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNextNode();
		}
		System.out.format("\nList length = %d\n\n", listLength);
	}

	public static void main(String[] args) {

		LinkedListSingle testList = new LinkedListSingle();
		if (args.length > 0) {
			int data;
			long dataCount = 0;
			System.out.println("Singly linked list created");
			for (String s : args) {
				try {
					data = Integer.parseInt(s);
				} catch (NumberFormatException e) {
					System.err.println("Argument" + s + " must be an integer.");
					continue;
				}
				testList.addData(data);
				dataCount++;
			}

			System.out.format(" => Data added to the list! =>"
					+ "Total data added = %d", dataCount);

		} else {
			testList = null;
			System.out.println("No List Created");
		}
		int a = 1;
		Console console = System.console();
		while (a > 0) {
			a = Integer.parseInt(console.readLine("\n1 : Add data"
					+ "\t2 : Delete Data" + "\t3 : Print List" + "\t0 : Exit"
					+ "\nEnter you response : "));
			if (a == 1) {
				int data = Integer.parseInt(console.readLine("Enter data : "));

				if (testList.addData(data) == 1) {
					System.out.format("\nData = %d added successfully", data);
				}
			}

			if (a == 2) {
				int data = Integer.parseInt(console.readLine("Enter data : "));

				testList.deleteNodeByData(data);
			}

			if (a == 3) {
				testList.printList();
			}
		}
	}
}
