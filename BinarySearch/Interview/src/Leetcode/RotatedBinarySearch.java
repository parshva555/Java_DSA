package Leetcode;
//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr = {5,1,3};
        System.out.println(search(arr,5));
    }

    static int search(int [] nums,int target){
        int pivot = findPivot(nums);
        // if you did not find a pivot  it means the array is not rotated
        if(pivot == -1){
            // just do normal binary search
            return binary(nums,target,0,nums.length-1);
        }

        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]) {
            return binary(nums, target, 0, pivot - 1);
        }
        return binary(nums,target,pivot+1,nums.length-1);
    }
    static int findPivot(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid  = start + (end - start) / 2;
            // 4 Cases over here
            if(mid < end  && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    static int binary(int [] arr, int target,int start,int end){

        while(start <= end){
            // find the middle element
//            int middle = (start + end)/2;
            //integer has a fixed size. start and end may exceed the range of Integer which will give error
            // so instead we use
            int mid = start + (end - start) /2;
            // if we user basic mathematics its the same
            // i.e 2start + end - start / 2
            // i.e start + end / 2

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                // answer found
                return mid;
            }
        }
        // if element does not exist
        return -1;
    }
}
