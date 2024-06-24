package wipro;

class User {
	int userid;
	String username;

	public User(int userid, String username) {
		super();
		this.userid = userid;
		this.username = username;
	}
}

//constructor:- it has the sam class name, intialized and invoked when obj created and called. 
public class dstest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User[] user;

		user = new User[5];
		user[0] = new User(101, "sai");
		user[1] = new User(102, "arun");
		user[2] = new User(103, "arunrao");
		user[3] = new User(104, "charan");
		user[4] = new User(105, "banty");
		for (int i = 0; i < user.length; i++) {
			System.out.println(i + " " + user[i].userid + " " + user[i].username);
		}

	}

}
