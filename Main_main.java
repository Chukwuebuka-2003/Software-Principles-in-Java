// NAME: Ugwu Marylinda Onyinyechukwu 
// REG NO: 2020/243263


// Stack: This follows the Last-In-First-Out (LIFO) Principle

class Stack {
	private int maxSize;
	private int[] stackArray;
	private int top;

	public Stack(int size) {
		maxSize = size;
		stackArray = new int[maxSize];

		top = -1;
	}

	// Push operation
	
	public void push(int value) {
		if (top < maxSize - 1) {
			stackArray[++top] = value;
		} else {
			System.out.println("This stack is full");
		}
	}

	// Pop operation
	public int pop() {
		if (top >= 0) {
			return stackArray[top--];
		} else {
			System.out.println("This Stack is empty");
			return -1;
		}
	}

	// Peek Operation
	public int peek() {
		if (top >= 0) {
			return stackArray[top];
		} else {
			System.out.println("This Stack is empty");
			return -1;
		}
	}

	// An Example Operation
	public void display() {
		for (int i = top; i >= 0; i--) {
			System.out.print(stackArray[i] + " ");
		}
		System.out.println();
	}
}


class Queue {
	private int maxSize;
	private int[] queueArray;
	private int front;
	private int rear;
	private int nItems;

	public Queue(int size) {
		maxSize = size;
		queueArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	// Enqueue operation
	public void enqueue(int value) {
		if (rear == maxSize - 1) {
			rear = -1;
		}

		queueArray[++rear] = value;
		nItems++;
	}

	// Dequeue Operation
	public int dequeue() {
		if (nItems > 0) {
			int temp = queueArray[front++];
			if (front == maxSize) {
				front = 0;
			}

			nItems--;
			return temp;
		} else {
			System.out.println("This queue is empty");
			return -1;
		}
	}


	// Peek Operation
	
	public int peekFront() {
		if (nItems > 0) {
			return queueArray[front];
		} else {
			System.out.println("Queue is empty");
			return -1;
		}
	}

	// Display operation
	public void display() {
		int current = front;
		for (int i = 0; i < nItems; i++) {
			System.out.print(queueArray[current++] + " ");
			if (current == maxSize) {
				current = 0;
			}
		}
		System.out.println();
	}
}

public class Main_main {
	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push(1);
		stack.push(2);
		stack.display(); //Display stack
		System.out.println("Peek: " + stack.peek()); // Peek top element
		stack.pop(); // Pop an element
		stack.display(); // Display after the pop

		Queue queue = new Queue(5);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.display(); // Display queue
		System.out.println("Peek Front: " + queue.peekFront()); // Peeks front element
		queue.dequeue(); // Dequeue an element
		queue.display(); //Displays after the dequeue
	}
}

