import java.util.*;

class Solution {
    void findMinJumps(int arr []){
        // First check if size of array is less than 1
        if(arr.length <= 1) return 0;
        // if arr[0] is 0, then return -1;
        if(arr[0] == 0) return -1;

        // jumps: No. of jumps made.
        // maxReach: the farthest element you are going to jump to which corresponds to arr[i].
        // steps: total number of steps needed to reach till maxReach. 
        int jumps = 1, maxReach = arr[0], steps = arr[0];

        // Traverse the array from 1st element onwards.
        for(int i = 1; i < maxReach; i++) {
            // If you reach the end of the array, then return the number of jumps so far.
            if( i == arr.length - 1) return jumps;
            // update maxReach to the new number which you are targetting.
            maxReach = Math.max(maxReach, i+arr[i]);
            steps--; // reduce the remaining number of steps.
            if( steps == 0) { // this means you have reached the maxReach.
                jumps++; 
                if( i >= maxReach) return -1; // i should not be more than maxReach.
                steps = maxReach-i;
            }
        }
        return -1;
    }
}