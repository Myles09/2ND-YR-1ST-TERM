import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 2, 3, 6, };
        
    // Create a HashMap to store the frequency of elements
    Map<Integer, Integer> frequencyMap = new HashMap<>();
        
    // Count the frequency of each element in the array
    for (int num : arr) {
    frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
}
        
    // Print the duplicate elements
    System.out.println("Duplicate elements in the array:");
    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
    if (entry.getValue() > 1) {
    System.out.println(entry.getKey());
            }
        }
    }
}