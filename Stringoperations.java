package javaassignments20;

public class Stringoperations {
	public static String processStrings(String str1, String str2, int length) {
        // Step 1: Concatenate the strings
        String concatenated = str1 + str2;

        // Handle edge case where the concatenated string is empty
        if (concatenated.isEmpty()) {
            return "";
        }

        // Step 2: Extract the middle substring of the given length
        int totalLength = concatenated.length();
        
        // Handle edge case where the required length is larger than the concatenated string
        if (length >= totalLength) {
            length = totalLength;
        }

        // Find the start index of the middle substring
        int startIndex = (totalLength - length) / 2;

        // Extract the substring
        String middleSubstring = concatenated.substring(startIndex, startIndex + length);

        // Step 3: Reverse the substring
        String reversedSubstring = new StringBuilder(middleSubstring).reverse().toString();

        return reversedSubstring;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(processStrings("hello", "world", 5)); // Output: "oworl"
        System.out.println(processStrings("abc", "def", 4)); // Output: "bcde"
        System.out.println(processStrings("", "world", 3)); // Output: "rld"
        System.out.println(processStrings("hello", "", 2)); // Output: "ll"
        System.out.println(processStrings("hello", "world", 15)); // Output: "dlrowolleh"
        System.out.println(processStrings("", "", 5)); // Output: ""


	}

}
