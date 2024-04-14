import java.util.ArrayDeque;

public class ArrayDequeExample {

    public static void main(String[] args) {
        // Create an ArrayDeque to store numbers
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        // Add elements to the ArrayDeque
        numbers.addFirst(10);
        numbers.addLast(20);
        numbers.addLast(30);

        // Access elements using index
        System.out.println(numbers.getFirst()); // Output: 10
        System.out.println(numbers.getLast()); // Output: 30

        // Check if an element exists
        System.out.println(numbers.contains(20)); // Output: true
        System.out.println(numbers.contains(40)); // Output: false

        // Iterate over the ArrayDeque from front to back
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Remove an element from the front
        numbers.pollFirst(); // Remove the first element (10)

        // Remove an element from the back
        numbers.pollLast(); // Remove the last element (30)

        // Print the updated ArrayDeque
        System.out.println(numbers); // Output: [20]
    }
}
