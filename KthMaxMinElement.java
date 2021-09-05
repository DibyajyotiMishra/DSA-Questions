import java.util.*;
class Solution {
    static void minElement(int arr [], int k){
        Arrays.sort(arr);
        return arr[k-1];
    }

    static void maxElement(int arr [], int k){
        Arrays.sort(arr, Collections.reverseOrder());
        return arr[k-1];
    }
}