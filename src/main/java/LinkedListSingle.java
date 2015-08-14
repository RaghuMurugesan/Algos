/**
 * @author: Raghu Murugesan
 */

package main.java;
import java.util.Scanner;



public class LinkedListSingle{

	private Node list;
	private int listLength;

	LinkedListSingle (){
		list = null;
		listLength = 0;
	}
	
	public int addData(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		Node temp = this.list.getLastNode();
		temp.setNextNode(newNode);
		this.listLength ++;
		return(1);
//		System.out.println("");
	}

	public void deleteNodeByData(int data) {
		Node previousNode = this.list;

		Node thisNode = previousNode.getNextNode();

		if (thisNode == null)
		{	
			System.out.println("List is Empty");
			return;
		}
		int deleteCount = 0;
		while(thisNode != null) {

			if (thisNode.getData() == data ) {
				Node nextNode = thisNode.getNextNode();
				previousNode.setNextNode(nextNode);
				this.listLength --;
				deleteCount ++;
				thisNode = nextNode;
				}

			if ( deleteCount != 0) {
				System.out.println("Deletion Completed. Total Nodes deleted = "+ deleteCount);
			}
			else {
				System.out.println("No Match found");
			}
		}
	}

	public void printList(){
		Node temp = list.getNextNode();
		if (temp == null) {
			System.out.println("List Empty");
			return;
		}
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNextNode();
		}
		System.out.println("List length = \n"+ listLength +"Done");
	}
	
	public static void main(String[] args) {

		LinkedListSingle testList = new LinkedListSingle();
		
		if (args.length > 0) {

			int data;
			double dataCount = 0;
			System.out.println("Singly linked list created");
			
			for (String s: args) {
				
				try {
			        data = Integer.parseInt(s);
			    } catch (NumberFormatException e) {
			        System.err.println("Argument" + s + " must be an integer.");
			        continue;
			    }
				
				testList.addData(data);
				dataCount ++;
			}

			System.out.println("Data added to the list \n\n'Total data added = "+ dataCount);

		}
		else {
			testList = null;
			System.out.println("No List Created");
		}
		int a = 1;
		while (a > 0) {
			System.out.println("Enter input");
			System.out.println("1 : Add data");
			System.out.println("2 : Delete Data");
			System.out.println("3 : Print List");
			System.out.println("\nEnter you response");

			if(a == 1) {

				System.out.println("Enter a number");
				Scanner in = new Scanner(System.in);
				in.close();
				int data = in.nextInt();

				if(testList.addData(data) == 1) {
					System.out.println("Data = " + data + "added successfully" );
				}
			}
			
			if(a == 2) {
				System.out.println("Enter a number");
				Scanner in = new Scanner(System.in);
				in.close();
				int data = in.nextInt();
			
				testList.deleteNodeByData(data);
			}

			if(a == 3) {
				testList.printList();
			}
		}
	}
}