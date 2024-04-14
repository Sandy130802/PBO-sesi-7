import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        // Create an ArrayList to store names
        ArrayList<String> names = new ArrayList<>();

        // Add elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Access elements using index
        System.out.println(names.get(0)); // Output: Alice
        System.out.println(names.get(1)); // Output: Bob
        System.out.println(names.get(2)); // Output: Charlie

        // Check if an element exists
        System.out.println(names.contains("Alice")); // Output: true
        System.out.println(names.contains("David")); // Output: false

        // Iterate over the ArrayList
        for (String name : names) {
            System.out.println(name);
        }

        // Remove an element
        names.remove(1); // Remove the element at index 1 (Bob)

        // Print the updated ArrayList
        System.out.println(names); // Output: [Alice, Charlie]
    }
}
