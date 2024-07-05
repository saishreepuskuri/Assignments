package javaassignments20;

public class Uniqueelementfinder {
	public static int[] findUniqueElements(int[] nums) {
        // Step 1: XOR all elements
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        // Step 2: Find the rightmost set bit in the XOR result
        int setBit = xor & -xor; // This isolates the rightmost set bit

        // Step 3: Divide elements into two groups and XOR each group
        int unique1 = 0;
        int unique2 = 0;
        for (int num : nums) {
            if ((num & setBit) == 0) {
                unique1 ^= num; // XOR of one group
            } else {
                unique2 ^= num; // XOR of the other group
            }
        }

        return new int[]{unique1, unique2};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 1, 3, 2, 5};
        int[] uniqueElements = findUniqueElements(nums);
        System.out.println("The two unique elements are: " + uniqueElements[0] + " and " + uniqueElements[1]);
    }

	}


