import java.util.*;

class Solution {
    static void findUnion(int arr1[], int arr2[], int m, int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        int i = 0, j = 0;
        while (i < m && j < n) {
            set.add(arr1[i]);
            set.add(arr2[j]);
            i++;
            j++;
        }
        return set;
    }
}
