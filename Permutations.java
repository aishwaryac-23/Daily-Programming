import java.util.*;

public class Permutations {
    
    // Function to generate permutations
    public static void generatePermutations(String str, int index, StringBuilder current, Set<String> result) {
        // Base case: if the index reaches the end of the string, add the permutation to the result
        if (index == str.length()) {
            result.add(current.toString());
            return;
        }
        
        // Loop through each character in the string and generate permutations
        for (int i = index; i < str.length(); i++) {
            // Swap the characters
            char[] arr = str.toCharArray();
            char temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            
            // Recurse for the next index
            generatePermutations(new String(arr), index + 1, current.append(arr[index]), result);
            current.deleteCharAt(current.length() - 1);  // backtrack
        }
    }
    
    // Main function
    public static void main(String[] args) {
        int num = 123;
        String str = Integer.toString(num);
        Set<String> result = new HashSet<>();
        
        // Generate all permutations
        generatePermutations(str, 0, new StringBuilder(), result);
        
        // Print the permutations
        for (String perm : result) {
            System.out.println(perm);
        }
    }
}
