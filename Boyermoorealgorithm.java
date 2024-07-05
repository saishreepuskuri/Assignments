package javaassignments20;

public class Boyermoorealgorithm {
	private static final int ALPHABET_SIZE = 256;

    // Preprocesses the pattern and creates the bad character heuristic table
    private static int[] preprocessBadCharacter(String pattern) {
        int[] badChar = new int[ALPHABET_SIZE];
        int m = pattern.length();

        // Initialize all occurrences as -1
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            badChar[i] = -1;
        }

        // Fill the actual value of last occurrence of a character in the pattern
        for (int i = 0; i < m; i++) {
            badChar[pattern.charAt(i)] = i;
        }

        return badChar;
    }

    // Boyer-Moore algorithm to find the last occurrence of a pattern in a text
    public static int boyerMooreLastOccurrence(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        int[] badChar = preprocessBadCharacter(pattern);

        int shift = 0;
        int lastIndex = -1;

        while (shift <= (n - m)) {
            int j = m - 1;

            // Keep reducing j while characters of pattern and text are matching
            while (j >= 0 && pattern.charAt(j) == text.charAt(shift + j)) {
                j--;
            }

            // If the pattern is present at the current shift
            if (j < 0) {
                lastIndex = shift;
                shift += (shift + m < n) ? m - badChar[text.charAt(shift + m)] : 1;
            } else {
                // Shift the pattern so that the bad character in text aligns with the last
                // occurrence of it in the pattern. The max function is used to make sure that we get
                // a positive shift. We may get a negative shift if the last occurrence of the bad
                // character in pattern is on the right side of the current character.
                shift += Math.max(1, j - badChar[text.charAt(shift + j)]);
            }
        }

        return lastIndex;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "ABAAABCDABC";
        String pattern = "ABC";
        int lastIndex = boyerMooreLastOccurrence(text, pattern);

        if (lastIndex != -1) {
            System.out.println("Last occurrence of pattern found at index: " + lastIndex);
        } else {
            System.out.println("Pattern not found in the text.");
        }
	}

}
