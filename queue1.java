package wipro;

class Queue {
	static private int rear, front, capacity;
	static private int queue[];

	Queue(int c) {
		front = rear = 0;
		capacity = c;
		queue = new int[capacity];

	}

	static void queueEnque(int data) {
		if (capacity == rear) {
			System.out.println("/n Queue is full");
		} else {
			queue[rear] = data;
			rear++;
		}
		return;
	}

	static void queueDeque() {
		// if queue is empty
		if (capacity == rear) {
			System.out.println("\n queue is empty");
		} else {
			for (int i = 0; i < rear - 1; i++) {
				queue[i] = queue[i + 1];
			}
			if (rear < capacity) {
				queue[rear] = 0;
				rear--;
			}
			return;
		}
	}

	static void queueDisplay() {
		if (front == rear) {
			System.out.println("\n queue is empty");
			return;
		}
		for (int i = front; i < rear; i++) {
			System.out.printf("%d <--", queue[i]);
		}
		return;
	}

}

public class queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(5);
		q.queueEnque(10);
		q.queueEnque(20);
		q.queueEnque(30);
		q.queueEnque(40);
		q.queueEnque(50);
		System.out.println("queue elements are");
		q.queueDisplay();
		System.out.println("After removing element:  ");
		q.queueDeque();
		q.queueDisplay();

	}

}
