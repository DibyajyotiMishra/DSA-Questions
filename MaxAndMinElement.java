import java.util.*;
class Solution {
    static void findElement(int arr[], int n){
        Arrays.sort(arr);
        int max = arr[n-1]; //Maximum Element
        int min = arr[0];   //Minimum Element
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}