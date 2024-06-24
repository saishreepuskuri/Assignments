package wipro;

import java.util.LinkedList;
import java.util.Queue;

public class queuedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> que = new LinkedList<>();
		que.add("one");
		que.add("two");
		que.add("three");
		que.add("four");
		que.add("five");
		System.out.println(que.size());
		System.out.println(que);
		System.out.println("============");
		que.remove("five");
		System.out.println(que.size());
		System.out.println(que);
		System.out.println("=============");
		que.clear();
		System.out.println(que.size());
		System.out.println(que);
	}

}
