import java.util.*;
class Solution {
    public static int findDuplicates(int arr []){
        Set<Integer> duplicates = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(duplicates.contains(arr[i])){
                return arr[i];
            } else duplicates.add(arr[i]);
        }
        return -1;
    }
}