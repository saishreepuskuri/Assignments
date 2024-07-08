package javaassignments20;

public class ToweOfHanoi {
	

	    // Recursive function to solve Tower of Hanoi puzzle
	    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
	        if (n == 1) {
	            System.out.println("Move disk 1 from " + source + " to " + destination);
	            return;
	        }
	        towerOfHanoi(n - 1, source, destination, auxiliary);
	        System.out.println("Move disk " + n + " from " + source + " to " + destination);
	        towerOfHanoi(n - 1, auxiliary, source, destination);
	    }

	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 3; // Number of disks
	        towerOfHanoi(n, 'A', 'B', 'C');

	}

}
