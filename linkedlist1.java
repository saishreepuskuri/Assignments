package wipro;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("robin");
		ll.add("sai");
		ll.add("banty");
		ll.add("charan");
		ll.add("arun");
		Iterator<String> itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
