package Leetcode;

import java.util.Arrays;

public class FirstAndLastPositionOfArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,5,5,5,6};
        int target = 5;
        int [] ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchRange(int[] nums, int target) {
        int [] ans = {-1,-1};
        // check for first occurence of target first
        int start = search(nums,target, true);
        int end  = search(nums,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    // this function just returns the index value of target
    static int search(int [] nums , int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){

            int mid = start + (end - start) /2;
            if (target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }
                else{
                    start = mid  +1;
                }
            }
        }
        return ans;
    }
}