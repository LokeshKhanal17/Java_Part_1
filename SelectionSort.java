package DataStructures.Sorting;

public class SelectionSort {
    public static void main(String args[]){
        int [] arr = {7, 8, 3, 1, 2};
        
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            
            // Swap the smallest element with the current element (if different).
            if (smallest != i) {
                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;
            }
        }
        
        // Print the sorted array.
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
