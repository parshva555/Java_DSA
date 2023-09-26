package Leetcode;
// https://leetcode.com/problems/find-peak-element/
public class FindPeakElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,3,2,1};
        int ans  = findPeak(arr);
        System.out.println(ans);

    }
    public static int findPeak(int[] arr) {
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
}
