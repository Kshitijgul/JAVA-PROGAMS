package JAVA_Programs.Recursion;

public class rec_05_Arrays {

    // Recursive function to find the maximum in the array
    public static int find_max(int arr[], int idx) {
        // Base case: when the index reaches the last element, return the element
        if (idx == arr.length - 1) {
            return arr[idx];
        }

        // Recursive call to find the maximum in the rest of the array
        int max_in_rest = find_max(arr, idx + 1);

        // Return the maximum of current element and max from the rest of the array
        return Math.max(arr[idx], max_in_rest);
    }
    public static int SumArray(int arr[],int idx){
        if(idx == arr.length){
            return 0;
        }
        int SmallAns = SumArray(arr,idx + 1);
        return SmallAns + arr[idx];
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7, 8, 9};
        System.out.println("Array Length: " + arr.length);

        // Call the recursive function to find the maximum element in the array
        int max_value = find_max(arr, 0);
        System.out.println("Maximum value in the array: " + max_value);

        int sum_value = SumArray(arr,0);
        System.out.println(sum_value);
    }
}
