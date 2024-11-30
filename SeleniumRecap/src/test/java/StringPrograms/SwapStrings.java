package StringPrograms;

public class SwapStrings {
	
    public static void main(String[] args) {
        // Declare and initialize the strings
        String str1 = "Good";
        String str2 = "Morning";

        // Print original values
        System.out.println("Before swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // Swap values using a temporary variable
        String temp = str1;
        str1 = str2;
        str2 = temp;

        // Print swapped values
        System.out.println("After swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
