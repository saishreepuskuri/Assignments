package wipro;

class Stack {
	static final int Max = 1000;
	int top;
	int a[] = new int[Max];

	boolean isEmpty() {
		return (top < 0);
	}

	Stack() {
		top = -1;
	}

	boolean push(int x) {
		if (top >= (Max - 1)) {
			System.out.println("stack overflow");
			return false;
		} else {
			a[++top] = x;
			System.out.println(x + "pushed into stack");
			return true;
		}
	}

	int pop() {
		if (top < 0) {
			System.out.println("stack underflow");
			return 0;
		} else {
			int x = a[top--];
			return x;
		}
	}

	int peek() {
		if (top < 0) {
			System.out.println("stack underflow");
			return 0;
		} else {
			int x = a[top];
			return x;

		}
	}

	void print() {
		for (int i = top; i > -1; i--) {
			System.out.println(" " + a[i]);
		}
	}

}

public class stack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println("===================");
		System.out.println("stack elements are:  ");
		s.print();
		System.out.println("=====================");
		System.out.println(s.pop() + " popped from stack");
		System.out.println("=======================");
		s.print();
		s.peek();

	}

}
