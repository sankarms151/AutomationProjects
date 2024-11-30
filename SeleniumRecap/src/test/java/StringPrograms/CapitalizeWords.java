package StringPrograms;

public class CapitalizeWords {
    public static void main(String[] args) {
        // Original string
        String str = "i am 10 years 6 old";
        
        // Split the string into words
        String[] words = str.split(" ");
        
        // StringBuilder to build the result
        StringBuilder result = new StringBuilder();
        
        // Capitalize the first letter of each word
        for (String word : words) {
            if (!word.isEmpty()) {
                // Capitalize the first letter and append the rest of the word
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1))
                      .append(" ");
            }
        }
        
        // Convert StringBuilder to String and trim the trailing space
        String output = result.toString().trim();
        
        // Output the result
        System.out.println(output); // Should print "I Am 10 Years 6 Old"
    }
}
