import java.util.*;

class Solution {
    static void findIntersection(int arr1[], int arr2[]) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i = 0, j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1[i] == arr2[j]) {
                arr.add(arr[i]);
                i++; j++;
            }
            else if (arr1[i] < arr2[j]) {
                i++;
            }
            else j++;
        }
    }
}