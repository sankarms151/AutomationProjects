package arraysPrograms;

public class SecondLargestArray {
    public static void main(String[] args) {
        // Sample array
        int[] array = {10, 5, 20, 15, 25};

        // Find the second largest element
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // Check if second largest was found
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element in the array is: " + secondLargest);
        }
    }
}
