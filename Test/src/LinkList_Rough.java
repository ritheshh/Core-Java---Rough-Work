
class Node {
	Node nodeNext;
	int rollNo, totalMarks;
	String name;
}

class LinkTheNode {
	Node head;

	void insertNode(int rollNo, String name, int marks) {
		Node newNode = new Node();
		newNode.nodeNext = null;
		newNode.rollNo = rollNo;
		newNode.name = name;
		newNode.totalMarks = marks;

		if (head == null) {
			head = newNode;
		} else {
			Node tempNode = head;
			while (tempNode.nodeNext != null) {
				tempNode = tempNode.nodeNext;
			}
			tempNode.nodeNext = newNode;
		}
	}

	void printList(LinkTheNode obj) {
		Node tempNode = head;
		System.out.println("STUDENT DATA:");
		
		while (tempNode != null) {
			System.out.println("Roll No:\t" + tempNode.rollNo);
			System.out.println("Name:\t\t" + tempNode.name);
			System.out.println("Total Marks:\t" + tempNode.totalMarks + "\n");
			tempNode = tempNode.nodeNext;
		}
	}
	
	void inserAt(int index, int rollNo, String name, int marks) {
		
	}
}

public class LinkList_Rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkTheNode list = new LinkTheNode();
		list.insertNode(101, "Rithesh", 599);
		list.insertNode(111, "Ashmita", 598);
		list.insertNode(210, "Swetha Ravi", 450);
		
		list.insertAt(2, 205, "Sreenath", 501);

		list.printList(list);
	}

}
