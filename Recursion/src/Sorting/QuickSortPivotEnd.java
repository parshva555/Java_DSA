package Sorting;

import java.util.Arrays;

public class QuickSortPivotEnd {
    public static void main(String[] args) {
        int [] arr = {7,6,10,5,9,2,1,15,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int [] nums, int low,int high){
        int s = low;
        int e = high;
        int pivot = nums[high];
        if(low>high){
            return;
        }
        while(s<=e){
            while(nums[low]<pivot){
                s++;
            }
            while(nums[high]>pivot){
                e--;
            }
            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        sort(nums,low,e);
        sort(nums,s,high);
    }
}
