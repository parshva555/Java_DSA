package Leetcode;
// https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountainArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,2,1};
        int target = 5;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    static int search(int [] arr , int target){
        int peak = SearchInMountain(arr);
        int firstTry =orderAgnosticBinary(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        // try to search in the second half
        return orderAgnosticBinary(arr, target, peak+1, arr.length-1);
    }
    public static int SearchInMountain(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = start +(end - start) / 2;
            if( arr[mid] > arr[mid+1]){
                // You are in decreasing part of the array
                // this may be the answer but look at end
                // this is why end != mid-1;
                end = mid;
            }else{
                // You are at ascending part of the array
                start = mid + 1;  // bcoz we know tha mid + 1 element is greater than mid+1 element
            }
        }
        // in the end , start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find tha max elemnt using the 2 above checks
        // hence they are both pointing to just one element, that is the max one
        // that is because what the check says
        return start;
    }
    static int orderAgnosticBinary(int [] arr, int target, int start, int end){
        // find whether the array is sorted in ascending order or descending.
        boolean isAsc;
        if(arr[start] < arr[end]){
            isAsc = true;
        } else{
            isAsc = false;
        }


        while(start <= end){

            int mid = start + (end - start) /2;
            // common condition for both ascending and descending
            if ( arr[mid]  == target){
                return mid;
            }
            // For ascending
            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                } else if (target > arr[mid]){
                    start = mid + 1;
                }
            }
            // For descending
            else{
                if (target > arr[mid]){
                    end = mid-1;
                } else{
                    start = mid + 1;
                }
            }

        }
        // if element does not exist
        return -1;
    }
}
