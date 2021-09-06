import java.util.*;

class Solution {
    static void minimizeHeightOfTower(int arr [], int n, int k) {
        Arrays.sort(arr); // Sort the array in ascending order.
        int smallest = arr[0] + k, largest = arr[n - 1] - k; // increment smallest by k and decrement largest by k
        int max, min, diff = arr[n - 1] - arr[0]; // initialise diff as the difference of arr[0] and arr[n - 1]
        for(int i : arr) { // traverse the array
            min = Math.min(smallest, arr[i+1]+k); // make smallest as the minimum of current smallest and arr[i+1] + k
            max = Math.max(largest, arr[i]-k); // make largest as the maximum of current largest and arr[i] - k
            if(min < 0) continue; // min must not be a negative number
            diff = Math.min(diff, max - min); // make diff as the minimum of current difference and max-min.
        }
        return diff; // return diff.
    }
}