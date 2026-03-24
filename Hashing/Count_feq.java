package JAVA_Programs.Hashing;
import java.util.*;

public class Count_feq {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2, 3, 4, 4};

        // Create a HashMap to store element-frequency pairs
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Traverse the array
        for (int num : arr) {
            // If the element already exists in the map, increment its count
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequency of each element
        System.out.println("Element Frequencies:");
        for (Integer key : frequencyMap.keySet()) {
            System.out.println("Element: " + key + ", Frequency: " + frequencyMap.get(key));
        }
    }
}
