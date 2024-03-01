
// NAME: Chukwuebuka Ezeokeke


class Node{
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	Node head;

	// Inserting a new node at the end of a list
	public void append(int new_data) {
		Node new_node = new Node(new_data);
		if (head == null) {
			head = new Node(new_data);
			return;
		}

		new_node.next = null;
		Node last = head;
		while (last.next != null)
			last = last.next;
		last.next = new_node;

	}

	// Deleting a node by key
	
	void deleteNode(int key) {
		Node temp = head, prev = null;

		if (temp != null && temp.data == key) {
			head = temp.next;

			return;

		}

		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}

		if (temp == null) return;
		prev.next = temp.next;
	}

        // Method to update a node in the linkedlist by a key

	public void updateNode(int old_data, int new_data) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == old_data) {
				temp.data = new_data;
				return;
			}

			temp = temp.next;

		}

	}

	// Display the linked list
	
	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}

		System.out.println();

	}
}


// testing the linked list that i created with a main method

public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.append(10);
		list.append(23);
		list.append(35);
		System.out.println("The Original List That I Created");
		list.display();

		list.deleteNode(35);
		System.out.println("List after deleting node that contains the data 35");
		list.display();

		list.updateNode(10, 38);
		System.out.println("List after updating node from 10 TO 38:");
		list.display();

	}

}


