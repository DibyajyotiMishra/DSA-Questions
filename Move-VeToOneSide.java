import java.util.*;

class Solution {
    void moveNegatives(int arr [], int l, int r) // l = left; r= right;
    { 
        while (l <= r){
            if(arr[l] < 0 && arr[r] < 0) l++;
            if(arr[l] > 0 && arr[r] > 0) r--;
            if(arr[r] > 0 && arr[l] < 0) {
                int temp = arr[r];
                arr[r] = arr[l];
                arr[l] = temp;
            }
        }
        return arr;
    }
}