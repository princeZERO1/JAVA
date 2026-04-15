import java.util.*;

public class ArrayListExample1 {
    public static void main(String[] args) {
        // Create ArrayLists to represent arrays
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        // Add elements to arr1
        for (int i = 0; i < 5; i++) {
            arr1.add(1);
        }

        // Add elements to arr2
        for (int i = 0; i < 3; i++) {
            arr2.add(1);
        }

        // Store both ArrayLists in another ArrayList
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(arr1); // arr[0]
        arr.add(arr2); // arr[1]

        // Output arr[0] (which is {1,1,1,1,1})
        System.out.println("arr[0] = " + arr.get(0));

        // Output arr[1] (which is {1,1,1})
        System.out.println("arr[1] = " + arr.get(1));
    }
}