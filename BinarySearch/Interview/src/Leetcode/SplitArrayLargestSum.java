package Leetcode;
// https://leetcode.com/problems/split-array-largest-sum/submissions/
public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int m = 5;
        System.out.println(splitArray(arr,m));
    }
    public static int splitArray(int[] nums,int m){
        int start = 0;
        int end  = 0;
        for (int j : nums) {
            start = Math.max(start, j); // in  the end of this loop it will contain the max of this array
            end += j;
        }
        // binary search
        while(start < end){
            // try for the middle as the potential answer
            int mid  = start + (end - start) /2;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    // you cannot add this into the subarray, make new one
                    // say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }
            if(pieces>m) {
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return end;
    }
}
