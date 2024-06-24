package wipro;

class User1 {
	public String username;

	User1(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User1 [username=" + username + "]";
	}

}

public class dstest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = new int[] { 10, 20, 30, 40, 50 };
		System.out.println("array by literals: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i + " " + numbers[i]);

		}
		System.out.println("==========");
		User1[] users = new User1[] { new User1("Alex"), new User1("sai"), new User1("banty") };
		for (User1 u : users) {
			System.out.println(u);
		}

	}

}
