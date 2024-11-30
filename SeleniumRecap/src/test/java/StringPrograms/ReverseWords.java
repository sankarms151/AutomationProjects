package StringPrograms;

public class ReverseWords {

    public static void main(String[] args) {
        String input = "Hello World India";
        String reversed = reverseWords(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseWords(String str) {
        // Split the string by whitespace
        String[] words = str.split("\\s+");
        
    	
        
        // Initialize a StringBuilder to store the reversed words
        StringBuilder reversed = new StringBuilder();
        
        // Iterate through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add space between words except for the last word
            }
        }
        
        return reversed.toString();
    }
}
