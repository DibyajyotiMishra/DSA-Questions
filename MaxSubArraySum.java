// Kadene's Algorithm

class Solution {
    static void maxSum(int arr [], int n){
        int sum = 0, max=arr[0];
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
            max = Math.max(sum,max);
            if(sum < 0) sum = 0;
        }
        return max;
    }
}