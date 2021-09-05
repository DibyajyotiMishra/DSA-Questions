// Variation of Dutch National Flag Algorithm.

import java.util.*;

class Solution {
    static void swap(int x, int y){
        int temp = x + y;
        x = y;
        y = temp;
    }

    static void sort012(int arr [], int n){
        int low = 0, mid = 0, high = n-1;
        while(mid <= high){
            switch(arr[mid]){
                case 0: 
                   swap(low, mid);
                   low++; 
                   mid++;
                   break;
                case 1: 
                    mid++; 
                    break;
                case 2: 
                    swap(high, mid);
                    high--;
                    break;
            }
        }
        return arr;
    }
}