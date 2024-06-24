package wipro;

public class Test1 {
	static int calculate(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		System.out.println(calculate(10, 20));
		// here we created static method and called it in mainmethod, print statement .
		// we didnt created obj bcoz method is static.

	}

}
