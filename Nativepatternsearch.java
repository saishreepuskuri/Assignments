package javaassignments20;

public class Nativepatternsearch {

	public static void naivePatternSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int comparisons = 0;

        // Loop to slide the pattern over the text
        for (int i = 0; i <= n - m; i++) {
            int j;

            // For the current position, check for the pattern match
            for (j = 0; j < m; j++) {
                comparisons++;
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            // If the pattern is found
            if (j == m) {
                System.out.println("Pattern found at index " + i);
            }
        }

        // Print the total number of comparisons
        System.out.println("Total comparisons made: " + comparisons);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "AABAACAADAABAABA";
        String pattern = "AABA";

        naivePatternSearch(text, pattern);

	}

}
