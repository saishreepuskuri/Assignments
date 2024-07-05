package javaassignments20;

public class Bitwisealgorithm1 {

	public static int countSetBits(int x) {
        int count = 0;
        while (x > 0) {
            count += x & 1;
            x >>= 1;
        }
        return count;
    }
	public static int countTotalSetBits(int n) {
        int count = 0;
        int i = 1;  // Current bit position
        while (i <= n) {
            // Calculate total pairs of 0s and 1s in the current bit position
            int totalPairs = (n + 1) / (i * 2);
            count += totalPairs * i;
            // Calculate remaining 1s in the current bit position
            int remainingOnes = Math.max(0, (n + 1) % (i * 2) - i);
            count += remainingOnes;
            i *= 2;
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
        System.out.println("Number of set bits in " + num + ": " + countSetBits(num));  // Output: 2

        System.out.println("Total number of set bits from 1 to " + num + ": " + countTotalSetBits(num));
	}

}
