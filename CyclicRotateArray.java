import java.util.*;

class Solution {
    static void rotateArray(int[] arr, int n) {
        int tempArray = new int[n];
        tempArray[0] = arr[n-1];
        int i = 1;
        for (int j = 0; j < n; i++){
            tempArray[i] = arr[j];
        }
        return tempArray;
    }
}