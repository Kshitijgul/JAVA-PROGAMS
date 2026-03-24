package JAVA_Programs.Hashing;

import java.util.HashMap; // Import the HashMap class
import java.util.Map; // Import Map interface for Map.Entry

public class Hashmap_Basic {
    public static void main(String[] args) {
        // 1. Create a HashMap to store key-value pairs
        HashMap<String, Integer> studentMarks = new HashMap<>();

        // 2. Add key-value pairs using put()
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 92);
        studentMarks.put("Charlie", 78);
        studentMarks.put("David", 90);

        // Display the HashMap
        System.out.println("Initial HashMap: " + studentMarks);

        // 3. Get a value using get()
        System.out.println("Marks of Bob: " + studentMarks.get("Bob"));

        // 4. Check if a key exists using containsKey()
        String searchKey = "Charlie";
        if (studentMarks.containsKey(searchKey)) {
            System.out.println(searchKey + " exists in the HashMap with marks: " + studentMarks.get(searchKey));
        } else {
            System.out.println(searchKey + " does not exist in the HashMap.");
        }

        // 5. Use getOrDefault() to fetch value or provide a default if the key doesn't exist
        System.out.println("Marks of Eve (default 50): " + studentMarks.getOrDefault("Eve", 50));

        // 6. Replace the value of an existing key using replace()
        studentMarks.replace("Alice", 88); // Replace marks for Alice
        System.out.println("Updated HashMap after replacing Alice's marks: " + studentMarks);

        // 7. Iterate through the HashMap using Map.Entry
        System.out.println("\nIterating through the HashMap (key-value pairs):");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Marks: " + entry.getValue());
        }

        // 8. Get all keys using keySet()
        System.out.println("\nAll students (keys) in the HashMap:");
        for (String key : studentMarks.keySet()) {
            System.out.println(key);
        }

        // Final HashMap state
        System.out.println("\nFinal HashMap: " + studentMarks);
    }
}
