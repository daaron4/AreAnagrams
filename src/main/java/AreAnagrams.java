import java.util.Arrays;

public class AreAnagrams {
    public static boolean areAnagrams(String a, String b) {
        // Check for if either a or b is the empty string, if this happens, I return false
        if (a.equals("") || b.equals("")) {
            return false;
        }

        // Remove any potential white spaces - this I found online, they used some regex:
        char[] word1 = a.replaceAll("[\\s]", "").toCharArray();
        char[] word2 = b.replaceAll("[\\s]", "").toCharArray();

        // Organize arrays using Java's built in Arrays class:, O(nlog(n)) runtime:
        Arrays.sort(word1);
        Arrays.sort(word2);

        // If organized arrays contain the same letters, they are anagrams, return true:
        if (Arrays.equals(word1, word2)) {
            return true;
        }

        // Not anagrams, return false:
        else {
            return false;
        }

    }
}

