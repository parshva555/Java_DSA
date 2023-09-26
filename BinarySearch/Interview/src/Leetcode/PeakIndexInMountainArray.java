package Leetcode;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,5,3,1};
        int ans = peakIndex(arr);
        System.out.println("The peak index is :"+ ans);
    }
    public static  int peakIndex(int[] arr) {
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
        return start; // or end bcoz both are pointing at the same element that is maximum element or peak element
    }
}
