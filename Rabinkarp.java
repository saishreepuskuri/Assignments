package javaassignments20;

public class Rabinkarp {
	// d is the number of characters in the input alphabet
    public final static int d = 256;
    // q is a prime number
    public final static int q = 101;

    public static void search(String pattern, String text) {
        int m = pattern.length();
        int n = text.length();
        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for text
        int h = 1;
        int comparisons = 0; // to count number of comparisons

        // The value of h would be "pow(d, m-1) % q"
        for (i = 0; i < m - 1; i++) {
            h = (h * d) % q;
        }

        // Calculate the hash value of pattern and first window of text
        for (i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + text.charAt(i)) % q;
        }

        // Slide the pattern over text one by one
        for (i = 0; i <= n - m; i++) {

            // Check the hash values of current window of text and pattern
            // If the hash values match then only check for characters one by one
            if (p == t) {
                boolean match = true;
                for (j = 0; j < m; j++) {
                    comparisons++;
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                // if p == t and pattern[0...m-1] = text[i, i+1, ...i+m-1]
                if (match) {
                    System.out.println("Pattern found at index " + i);
                }
            }

            // Calculate hash value for next window of text: Remove leading digit,
            // add trailing digit
            if (i < n - m) {
                t = (d * (t - text.charAt(i) * h) + text.charAt(i + m)) % q;

                // We might get negative value of t, converting it to positive
                if (t < 0) {
                    t = (t + q);
                }
            }
        }

        // Print the total number of comparisons
        System.out.println("Total comparisons made: " + comparisons);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "GEEKS FOR GEEKS";
        String pattern = "GEEK";
        search(pattern, text);

	}

}
