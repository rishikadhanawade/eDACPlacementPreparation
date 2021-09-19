package queuepack;

public class CircQueue {
	int front, rear, size, Q[];

	public CircQueue(int size) {
		super();
		front = rear = -1;
		this.size = size;
		Q = new int[size];
	}

	public void enQueue(int e) {
		if (front == -1)
			front++;
		rear = (rear + 1) % size;
		Q[rear] = e;
	}

	public int deQueue() {
		int t = Q[front];
		if (front == rear)  //means we are deleting last element so setting them -1
			front = rear = -1;
		else
			front = (front + 1) % size;
		return t;
	}

	public boolean isEmpty() {
		if (rear == -1 && front == rear)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (front == (rear + 1) % size)
			return true;
		else
			return false;
	}

	public void print() {

		if (front == -1 && rear == -1)
			System.out.println("Queue is empty");
		
		
		// If rear has not crossed the max size
		// or queue rear is still greater then
		// front.
		else if (rear >= front) {
			for (int i = front; i <= rear; i++) {
				System.out.println(Q[i]);
			}
		}
		
		
		// If rear crossed the max index and
	    // indexing has started in loop
		else {
			
			// Loop for printing elements from
	        // front to max size or last index
			for(int i=front;i<size;i++) {
				System.out.println(Q[i]);
			}
			
			// Loop for printing elements from
	        // 0th index till rear position
			for(int i=0;i<=rear;i++) {
				System.out.println(Q[i]);
			}
		}
	}
}
